package Models;

import java.util.List;
import java.util.Map;

public class Floor {

    private int id;
    List<Slot> slots;
    int floorNo;
    Map<AllowedVehicleTypes,Integer> specificCapacity;
    private FloorStatus floorStatus;
    List<AllowedVehicleTypes> allowedVehicleTypes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public Map<AllowedVehicleTypes, Integer> getSpecificCapacity() {
        return specificCapacity;
    }

    public void setSpecificCapacity(Map<AllowedVehicleTypes, Integer> specificCapacity) {
        this.specificCapacity = specificCapacity;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<AllowedVehicleTypes> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<AllowedVehicleTypes> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }
}
