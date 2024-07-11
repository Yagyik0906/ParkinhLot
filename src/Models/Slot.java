package Models;

public class Slot extends BaseModel{
    VehicleType allowedVehicleType;
    SlotStatus slotStatus;

    Floor parkingFloor;
    int slotNo;

    public Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public VehicleType getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(VehicleType allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
}
