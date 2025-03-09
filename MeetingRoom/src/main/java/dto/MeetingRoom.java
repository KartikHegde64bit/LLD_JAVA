package dto;

import java.util.List;
import java.util.UUID;

public class MeetingRoom {
    UUID bookingId;

    public List<Slot> getSlotList() {
        return slotList;
    }

    List<Slot> slotList;
    boolean isBooked = false;

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public MeetingRoom(Integer capacity, List<Slot> slotList){
        this.slotList = slotList;
        this.bookingId = UUID.randomUUID();
    }

}
