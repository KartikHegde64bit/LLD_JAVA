import dto.MeetingRoom;
import dto.Slot;
import services.MeetingService;
import services.UserService;

import java.util.List;
import java.util.UUID;

public class Application {
    public static void main(String args[]){

        // User login
        UserService userService = new UserService();
        UUID userId = userService.createUser("Kartik");

        MeetingService meetingService = new MeetingService();

        Slot slot1 = new Slot();
        List<Slot> slotList = List.of(slot1);
        Integer capacity = 5;

        MeetingRoom meetingRoom1 = new MeetingRoom(capacity, slotList);
        List<MeetingRoom> meetingRoomList = List.of(meetingRoom1);

        // register booking room
        meetingService.registerRooms(meetingRoomList);

        // book a room
        UUID bookingId = meetingService.bookMeetingRoom(userId, slot, noOfPeople);

        // book another room with conflicting time
        Integer bookingId2 =  meetingService.bookRoom(userId, slot, noOfPeople);

        // cancel a booking using booking id
        meetingService.cancelBooking(bookingId);
    }
}
