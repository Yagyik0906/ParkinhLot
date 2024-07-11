package Models;

public class Slot {
    int slotId;
    AllowedVehicleTypes allowedVehicleType;
    SlotStatus slotStatus;
    int slotNo;

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public AllowedVehicleTypes getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(AllowedVehicleTypes allowedVehicleType) {
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
