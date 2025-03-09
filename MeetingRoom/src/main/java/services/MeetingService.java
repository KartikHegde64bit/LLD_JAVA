package services;

import dto.Booking;
import dto.MeetingRoom;
import dto.Slot;
import dto.User;
import repository.MemoryRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MeetingService {

    public UUID bookMeetingRoom(UUID userId, Slot userSlot, Integer noOfPeople){

        // check if the room is available at given time
        User user = new UserService().getUserByUserId(userId);
        Booking newBooking = null;
        try {
            List<MeetingRoom> availableRooms = MemoryRepository.getMeetingRoomList().stream().filter(meetingRoom ->
                !meetingRoom.isBooked()
            ).collect(Collectors.toList());

            List<Slot> availableSlots;
            for(MeetingRoom meetingRoom: availableRooms){
                availableSlots = meetingRoom.getSlotList().stream()
                        .filter(slot ->
                                !slot.isBooked() &&
                                        !slot.getStartTime().after(userSlot.getStartTime()) &&
                                        !slot.getEndTime().before(userSlot.getEndTime())
                        )
                        .collect(Collectors.toList());
                if(availableSlots.size() > 0){
                    Slot freeSlot = availableSlots.get(0);
                    newBooking = new Booking(user, meetingRoom, noOfPeople, freeSlot);
                    freeSlot.setBooked(true);
                    break;
                }
            }
        if(newBooking != null){
            return newBooking.getBookingId();
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public void registerRooms(List<MeetingRoom> meetingRoomList){

    }
}
