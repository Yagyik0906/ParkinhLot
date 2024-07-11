package Models;

import Strategy.FeeCalculationStrategy;
import Strategy.SlotSelectionStrategy;

import java.util.List;

public class ParkingArea {
    private int id;
    List<Floor> floors;
    private int capacity;
    List<Gate> gates;
    List<AllowedVehicleTypes> allowedVehicleTypes;
    private String nameOfParkingArea;
    private String address;
    FeeCalculationStrategy feeCalculationStrategy;
    SlotSelectionStrategy slotSelectionStrategy;
    private ParkingAreaStatus parkingAreaStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
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

    public List<AllowedVehicleTypes> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<AllowedVehicleTypes> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public String getNameOfParkingArea() {
        return nameOfParkingArea;
    }

    public void setNameOfParkingArea(String nameOfParkingArea) {
        this.nameOfParkingArea = nameOfParkingArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FeeCalculationStrategy getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    public SlotSelectionStrategy getSlotSelectionStrategy() {
        return slotSelectionStrategy;
    }

    public void setSlotSelectionStrategy(SlotSelectionStrategy slotSelectionStrategy) {
        this.slotSelectionStrategy = slotSelectionStrategy;
    }

    public ParkingAreaStatus getParkingAreaStatus() {
        return parkingAreaStatus;
    }

    public void setParkingAreaStatus(ParkingAreaStatus parkingAreaStatus) {
        this.parkingAreaStatus = parkingAreaStatus;
    }
}
