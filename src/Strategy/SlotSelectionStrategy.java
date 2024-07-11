package Strategy;

import Models.Gate;
import Models.VehicleType;
import Models.Slot;

public interface SlotSelectionStrategy {
    public Slot getSlot(VehicleType vehicleType, Gate gate);
}
