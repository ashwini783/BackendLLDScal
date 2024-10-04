package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer, Ticket> tickets=new TreeMap();
    private static int previosID=0;

    public Ticket save(Ticket ticket) {
        previosID+=1;
        ticket.setId(previosID);
        tickets.put(previosID,ticket);
        return ticket;
    }
}
