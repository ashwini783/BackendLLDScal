package ParkingLot.dtos;

import sun.security.provider.certpath.OCSPResponse;

public class IssueTicketResponseDTO {
    private int ticketId;
    private ResponseStatus responseStatus;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }



}
