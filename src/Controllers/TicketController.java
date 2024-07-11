package Controllers;

import Dtos.IssueTicketRequest;
import Dtos.IssueTicketResponse;
import Models.Ticket;
import Service.TicketService;

import java.util.Date;

public class TicketController {

    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }

    public IssueTicketResponse IssueTicket(IssueTicketRequest issueTicketRequest){
       Ticket t=ticketService.IssueTicket(issueTicketRequest.getVehicleNo(),issueTicketRequest.getOwnerName(),
               issueTicketRequest.getGateId(),issueTicketRequest.getVehicleType());
       IssueTicketResponse response=new IssueTicketResponse();
       response.setTicketNo(t.getTokenNo());
       response.setSlot(t.getSlot());
       response.setEntryTime(t.getUpdatedAt());
       response.setVehicle(t.getVehicle());
       return response;
    }

    //1. need to interact with the client
    //2. client send request -> validate that
    //3. call service for business logic
    //4. response from service send back to the client
}

/* class Controller {
    DTO : auth,token,class_id
    AuthService
    classService
}
*/
