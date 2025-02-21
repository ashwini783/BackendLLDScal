package ParkingLot.services;

import ParkingLot.controller.TicketController;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;

        public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,TicketRepository ticketRepository) {
            this.gateRepository=gateRepository;
            this.vehicleRepository=vehicleRepository;
            this.ticketRepository=ticketRepository;
        }
    public Ticket issueTicket(int gateId, String vehicleNumber, String ownerName, VehicleType vehicleType) throws Exception {
        //to create ticket object what all info we are going to need
        //1.properly create ticket object with required details
        Ticket ticket = new Ticket();
          ticket.setEntryTime(new Date());

          //now set the gate
        Optional<Gate>gateOptional=gateRepository.findGateById(gateId); //through gateId from DB extract the information of Gate from Repository
        if(!gateOptional.isPresent()){
            throw new Exception("Gate not found");
        }
        Gate gate=gateOptional.get();
         ticket.setGate(gate);
         ticket.setOperator(gate.getOperator());

         Optional<Vehicle>vehicleOptional= vehicleRepository.findVehiclebyNumber(vehicleNumber);
         Vehicle vehicle;
         if(!vehicleOptional.isPresent()){
             vehicle=new Vehicle();
             vehicle.setLicensePlate(vehicleNumber);
             vehicle.setOwnerName(ownerName);
             vehicle.setVehicleType(vehicleType);
             vehicle=vehicleRepository.save(vehicle);  //saving the vehicle and returning the same thing because vehicle after saving and returning is contain the id
         }
         else{
             vehicle=vehicleOptional.get();
         }
         ticket.setVehicle(vehicle);

        //2.Assign the slot
           ParkingLot parkingLot=gate.getParkingLot();
         ParkingSlots parkingSlots= SlotAssignmentStrategyFactory
                 .getSlotAssignmentStrategyByType(parkingLot.getSlotAssignmentStrategyType())
                 .assignSlot(parkingLot,vehicleType);

         ticket.setParkingSlots(parkingSlots);

        // 3. return the data

        return ticketRepository.save(ticket);

    }
}

//Issue Ticket
//code models
//        Controller:TicketController
//    then we need DTO's
//   Setup the controller with proper argument
// Handle the exception in controller
//Ticket Service for business logic implementation
//Started preparing all the data required for the ticket Object
//Created Repository for Gate to get the object from id
//Discussed about why Optional are better than basic null checks
//Setup the vehicle
//while Assigning the slot
   //created Strategy and strategy needs parking Lot
      //1.either get it through gateId
       //2.get ParkingLot Id from the customer
       //3.Have the Parking Lot ref in gate so when you get the Gate , u automatically get the ParkingLot

// H.W Complete Gate repo and vehicle repo
