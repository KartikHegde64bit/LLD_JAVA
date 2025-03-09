package dto;

import java.time.LocalDateTime;

public class Slot {
    private Integer slotNumber;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isBooked;

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    @Override
    public String toString(){
        return "SlotInfo: {" +
                "StartTime: " + this.startTime + " " +
                "EndTime: " + this.endTime + "}" + " " +
                "Is Booked: " + this.isBooked() + " ";

    }
}
