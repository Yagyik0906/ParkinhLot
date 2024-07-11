import Controllers.TicketController;
import Dtos.IssueTicketRequest;
import Dtos.IssueTicketResponse;
import Models.VehicleType;
import Service.TicketService;
import repo.*;

public class Main {
    public static void main(String[] args) {

        GateRepo gr=new GateRepo();
        //populate data
        TicketRepo tr=new TicketRepo();
        //populate data
        VehicleRepo vr=new VehicleRepo();
        //populate data
        SlotRepo sr=new SlotRepo();
        //populate data
        ParkingLotRepo pr=new ParkingLotRepo();
        TicketService ts=new TicketService(gr,vr,sr,pr,tr);
        TicketController tc=new TicketController(ts);
       //request
        IssueTicketRequest request=new IssueTicketRequest();
        request.setGateId(2);
        request.setOwnerName("Yagyik");
        request.setVehicleNo("NY5009");
        request.setVehicleType(VehicleType.CAR);
        //response DTO
        IssueTicketResponse response=tc.IssueTicket(request);
    }
}