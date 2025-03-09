import dto.MeetingRoom;
import dto.Slot;
import services.MeetingService;
import services.UserService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Application {
    public static void main(String[] args) {

        // User login
        UserService userService = new UserService();
        UUID userId = userService.createUser("Kartik");

        MeetingService meetingService = new MeetingService();

        // Define slots for the meeting room
        Slot slot1 = new Slot();
        slot1.setStartTime(LocalDateTime.of(2025, 3, 10, 9, 0));
        slot1.setEndTime(LocalDateTime.of(2025, 3, 10, 12, 0));
        slot1.setBooked(false);
        System.out.println("Slot 1 : " + slot1);

        Slot slot2 = new Slot();
        slot2.setStartTime(LocalDateTime.of(2025, 3, 10, 13, 0));
        slot2.setEndTime(LocalDateTime.of(2025, 3, 10, 15, 0));
        slot2.setBooked(false);
        System.out.println("Slot 2 : " + slot2);

        List<Slot> slotList = List.of(slot1, slot2);
        Integer capacity = 5;

        // Create meeting room with slots
        MeetingRoom meetingRoom1 = new MeetingRoom(capacity, slotList);
        List<MeetingRoom> meetingRoomList = List.of(meetingRoom1);

        // Register meeting rooms
        meetingService.registerRooms(meetingRoomList);

        // Test case 1: Book a room successfully
        Slot testSlot1 = new Slot();
        testSlot1.setStartTime(LocalDateTime.of(2025, 3, 10, 9, 30));
        testSlot1.setEndTime(LocalDateTime.of(2025, 3, 10, 11, 30));
        Integer noOfPeople1 = 3;
        UUID bookingId = meetingService.bookMeetingRoom(userId, testSlot1, noOfPeople1);

        // Test case 2: Book a conflicting slot (should fail)
        Slot testSlot2 = new Slot();
        testSlot2.setStartTime(LocalDateTime.of(2025, 3, 10, 10, 0));
        testSlot2.setEndTime(LocalDateTime.of(2025, 3, 10, 12, 0));
        Integer noOfPeople2 = 3;
        try {
            UUID bookingId2 = meetingService.bookMeetingRoom(userId, testSlot2, noOfPeople2);
            System.out.println("Booking Successful: " + bookingId2);
        } catch (Exception e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }

        // Test case 3: Cancel a booking
        meetingService.cancelBooking(bookingId);
        System.out.println("Booking Canceled: " + bookingId);

        // Test case 4: Try booking again after cancellation (should succeed)
        UUID newBookingId = meetingService.bookMeetingRoom(userId, testSlot1, noOfPeople1);
        System.out.println("Re-booking Successful: " + newBookingId);
    }
}
