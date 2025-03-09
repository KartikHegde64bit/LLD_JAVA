package services;

import dto.Booking;
import dto.MeetingRoom;
import dto.Slot;
import dto.User;
import repository.MemoryRepository;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

public class MeetingService {

    public void registerRooms(List<MeetingRoom> rooms) {
        MemoryRepository.addMeetingRooms(rooms);
    }

    private boolean isOverlapping(Slot slot, Slot requestedSlot) {
        return !slot.getEndTime().isBefore(requestedSlot.getStartTime()) &&
                !slot.getStartTime().isAfter(requestedSlot.getEndTime());
    }

    public UUID bookMeetingRoom(UUID userId, Slot requestedSlot, int noOfPeople) {
        User user = MemoryRepository.getUserList().stream()
                .filter(u -> u.getUserId().equals(userId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Optional<MeetingRoom> availableRoom = MemoryRepository.getMeetingRoomList().stream()
                .filter(room -> room.getCapacity() >= noOfPeople)
                .flatMap(room -> room.getSlotList().stream()
                        .filter(slot -> !slot.isBooked() && isOverlapping(slot, requestedSlot))
                        .map(slot -> room))
                .findFirst();

        if (availableRoom.isPresent()) {
            MeetingRoom room = availableRoom.get();
            Slot bookedSlot = room.getSlotList().stream()
                    .filter(slot -> !slot.isBooked() && isOverlapping(slot, requestedSlot))
                    .findFirst()
                    .orElseThrow();
            bookedSlot.setBooked(true);
            room.setBooked(true);
            Booking booking = new Booking(user, room, noOfPeople, bookedSlot);
            MemoryRepository.addBooking(booking);
            System.out.println("Booking successfull: " + booking);
            return booking.getBookingId();
        }
        throw new IllegalStateException("No available rooms for the requested slot");
    }

    public void cancelBooking(UUID bookingId) {
        Optional<Booking> booking = MemoryRepository.getBookingList().stream()
                .filter(b -> b.getBookingId().equals(bookingId))
                .findFirst();

        booking.ifPresent(b -> {
            b.getSlot().setBooked(false);
            b.getBookingRoom().setBooked(false);
            MemoryRepository.getBookingList().remove(b);
        });
    }
}
