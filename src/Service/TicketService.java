package Service;

import Models.*;
import Strategy.SlotSelectionStrategy;
import Strategy.getSlotFactory;
import repo.*;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepo gr;
    private VehicleRepo vehicleRepo;
    private SlotRepo slotRepo;

    private ParkingLotRepo parkingLotRepo;
    private TicketRepo ticketRepo;
    public TicketService(GateRepo gr,
                         VehicleRepo vehicleRepo,
                         SlotRepo slotRepo,
                         ParkingLotRepo parkingLotRepo
            , TicketRepo ticketRepo){
        this.gr=gr;
        this.vehicleRepo = vehicleRepo;
        this.slotRepo=slotRepo;
        this.parkingLotRepo=parkingLotRepo;
        this.ticketRepo=ticketRepo;
    }

    public Ticket IssueTicket(String vehicleNumber,
                              String vehicleOwner, int gateId,
                              VehicleType vehicleType){
        //create a Ticket with a ticket Number
        Ticket t=new Ticket();
        // find a slot and change the slot status
        t.getEntryTime(new Date());
        Optional<Gate> gateOptional=gr.findGateById(gateId);
        if(gateOptional.isEmpty()){
            System.out.println("Gate is empty..");
            return null;
        }
        Gate g= gateOptional.get();
        t.setEntryGate(g);
        Vehicle v;
        Optional<Vehicle> vehicleOptional= vehicleRepo.findVehicleByNumber(vehicleNumber);
        if(vehicleOptional.isEmpty()){
            Vehicle newVehicle=new Vehicle();
            newVehicle.setVehicleNo(vehicleNumber);
            newVehicle.setVehicleTye(vehicleType);
            newVehicle.setOwnerName(vehicleOwner);

            v=vehicleRepo.saveVehicle(newVehicle);
        }else{
            v=vehicleOptional.get();
        }
        t.setVehicle(v);
        // store entry time and other info
        SlotSelectionStrategy strategy= getSlotFactory.getSlotSelectionStrategy(g.getParkingLot().getSlotAssignmentStrategy());
        if(strategy.equals(null)){
            System.out.println("No slot selection strategy find");
            return null;
        }
        Slot s= strategy.getSlot(vehicleType,g);
        t.setSlot(s);
        slotRepo.updateSlot(s,SlotStatus.FILLED);
        //reduce the number of parking lot capacity
        parkingLotRepo.updateCountById(g.getParkingLot());
        // save ticket to db
        Ticket finalTicketWithId=ticketRepo.saveTicket(t);
        // return the ticket
        return finalTicketWithId;
    }
}
