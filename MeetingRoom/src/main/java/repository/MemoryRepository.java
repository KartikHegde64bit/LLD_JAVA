package repository;

import dto.Booking;
import dto.MeetingRoom;
import dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MemoryRepository {

    private static final List<User> userList = new CopyOnWriteArrayList<>();
    private static final List<MeetingRoom> meetingRoomList = new CopyOnWriteArrayList<>();
    private static final List<Booking> bookingList = new CopyOnWriteArrayList<>();

    public static List<Booking> getBookingList() {
        return new ArrayList<>(bookingList);
    }

    public static void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    public static List<MeetingRoom> getMeetingRoomList() {
        return new ArrayList<>(meetingRoomList);
    }

    public static void addMeetingRooms(List<MeetingRoom> rooms) {
        meetingRoomList.addAll(rooms);
    }

    public static List<User> getUserList() {
        return new ArrayList<>(userList);
    }

    public static void addUser(User user) {
        userList.add(user);
    }
}
