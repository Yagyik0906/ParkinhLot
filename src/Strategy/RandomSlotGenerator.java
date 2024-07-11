package Strategy;

import Models.Gate;
import Models.Slot;
import Models.VehicleType;

public class RandomSlotGenerator implements SlotSelectionStrategy{
    @Override
    public Slot getSlot(VehicleType vehicleType, Gate gate) {
        //find parkingLot from gate..
        //find a floor with allowed vehicle type
        // return ths slot with same type where status is empty
        return null;
    }
}
