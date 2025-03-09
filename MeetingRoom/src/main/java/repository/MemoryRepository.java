package repository;

import dto.MeetingRoom;
import dto.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryRepository {

    public static List<User> userList;
    public static List<MeetingRoom> meetingRoomList;

    public static List<MeetingRoom> getMeetingRoomList() {
        return meetingRoomList;
    }

    public static void setMeetingRoomList(List<MeetingRoom> meetingRoomList) {
        MemoryRepository.meetingRoomList = meetingRoomList;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        MemoryRepository.userList = userList;
    }

}
