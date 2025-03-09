package dto;

import java.util.List;
import java.util.UUID;

public class MeetingRoom {

    Integer capacity = 0;
    UUID bookingId;
    List<Slot> slotList;
    boolean isBooked = false;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public MeetingRoom(Integer capacity, List<Slot> slotList){
        this.slotList = slotList;
        this.capacity = capacity;
        this.bookingId = UUID.randomUUID();
    }

}
