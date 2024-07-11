package Models;

public class Vehicle extends BaseModel{
    private String vehicleNo;
    private VehicleType vehicleTye;
    private String ownerName;

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleTye() {
        return vehicleTye;
    }

    public void setVehicleTye(VehicleType vehicleTye) {
        this.vehicleTye = vehicleTye;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
