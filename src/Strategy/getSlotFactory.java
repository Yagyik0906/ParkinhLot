package Strategy;

import Models.SlotAssignmentStrategy;

public class getSlotFactory {

    public static SlotSelectionStrategy getSlotSelectionStrategy(SlotAssignmentStrategy slotAssignmentStrategy){
        if(slotAssignmentStrategy.equals(SlotAssignmentStrategy.RANDOM)){
            return new RandomSlotGenerator();
        }
        return null;
    }
}
