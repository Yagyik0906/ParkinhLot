package Models;

import Strategy.FeeCalculationStrategy;
import Strategy.SlotSelectionStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Floor> parkingFloor;
    private int capacity;
    private List<Gate> gates;
    List<VehicleType> allowedVehicleTypes;
    private String nameOfParkingLot;
    private String address;
    private SlotAssignmentStrategy slotAssignmentStrategy;
    private ParkingLotStatus parkingLotStatus;

    public List<Floor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<Floor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public String getNameOfParkingLot() {
        return nameOfParkingLot;
    }

    public void setNameOfParkingLot(String nameOfParkingLot) {
        this.nameOfParkingLot = nameOfParkingLot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SlotAssignmentStrategy getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategy slotAssignmentStrategy) {
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
