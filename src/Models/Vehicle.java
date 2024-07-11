package Models;

public class Vehicle {
    private int vehicleId;
    private String vehicleNo;
    private AllowedVehicleTypes vehicleTye;
    private String ownerName;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public AllowedVehicleTypes getVehicleTye() {
        return vehicleTye;
    }

    public void setVehicleTye(AllowedVehicleTypes vehicleTye) {
        this.vehicleTye = vehicleTye;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
