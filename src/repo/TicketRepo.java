package repo;

import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {
    int previousId=-1;
    private Map<Integer,Ticket> ticketMap=new HashMap<>();
    public Ticket saveTicket(Ticket t){
        int newNumber=previousId+1;
        t.setId(newNumber);
        ticketMap.put(newNumber,t);
        return t;
    }
}
