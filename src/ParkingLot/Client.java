package ParkingLot;

import ParkingLot.controller.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository=new GateRepository();
        VehicleRepository vehicleRepository=new VehicleRepository();
        TicketRepository ticketRepository=new TicketRepository();
        TicketService ticketService=new TicketService(gateRepository,vehicleRepository,ticketRepository);
        TicketController ticketController=new TicketController(ticketService);
        IssueTicketRequestDTO request=new IssueTicketRequestDTO();
        request.setGetId(1);
        request.setVehicleNumber("DL 1vc 0001");
        request.setOwnerName("Ashwini");
        IssueTicketResponseDTO responseDTO=ticketController.issueTicket(request);

        if(responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Ticket Generated Successfully");
            System.out.println(responseDTO.getTicket().getParkingSlots().getSlotNumber());
        }
        else{
            System.out.println("Ticket Generation Failed due to "+responseDTO.getFailureMessage());
        }
    }
}

//creation of ticket:CRUD   Ticket-->TicketController
//Floor-->FloorController
//Client-->Controller->Service->Model
// we have just setup our ticket object and assigned slot using assignedSlot Strategy and saved the ticket and returned ticket
//Client-->TicketController-->TicketService-->Repository

//Complete code and  implement generate Bill function