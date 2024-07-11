package Models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String tokenNo;
    private Date entryTime;
    private Slot slot;
    private Vehicle vehicle;
    private Gate entryGate;


    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
