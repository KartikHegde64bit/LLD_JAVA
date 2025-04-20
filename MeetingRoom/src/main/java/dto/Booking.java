package dto;

import java.util.UUID;

public class Booking {
    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    UUID bookingId;
    User user;
    MeetingRoom meetingRoom;
    Integer capacity;
    Slot slot;

    public Booking(User user, MeetingRoom meetingRoom, Integer capacity, Slot slot){
        this.user = user;
        this.meetingRoom = meetingRoom;
        this.capacity = capacity;
        this.slot = slot;
        this.bookingId = UUID.randomUUID();
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public MeetingRoom getBookingRoom() {
        return meetingRoom;
    }

    public void setBookingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString(){
        return "Booking Details: {" +
                "UserName" + this.getUser().getUserName() + " " +
                "Slot" + this.slot + " " +
                "for " + this.capacity + " people ";
    }

}
