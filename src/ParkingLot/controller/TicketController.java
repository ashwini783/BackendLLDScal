package ParkingLot.controller;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;

    }

    // it is not good idea to actually send the your  model directly to controller, it is never good idea to sent your whole model back to user as it is
    //hence we use DTO--> to help u with communication between client and Controller

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){

        //request object can have lot of other details internally , so we dont send the request dto everywhere
        IssueTicketResponseDTO response=new IssueTicketResponseDTO();
        try{
            //request object can have lot of other details, so internally we dont send request DTO everywhere
            Ticket ticket=ticketService.issueTicket(requestDTO.getGetId(), requestDTO.getVehicleNumber(),requestDTO.getOwnerName(),requestDTO.getVehicleType());
            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);


        }
        catch(Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }
        return response;
    }


}
//using model directly with client is not suggested so for that we use DTO(Data Transfer Object)
// Controller job is to accept the request and send the response back
//client-->Controller-->Service-->Model
//Service job is to actually generate the ticket and perform whole business logic, it is returning Ticket object back