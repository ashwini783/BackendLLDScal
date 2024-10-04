package ParkingLot.strategies;

import ParkingLot.models.*;

public class RandomSlotAssignmnetStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlots assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor:parkingLot.getParkingFloors()){
            for(ParkingSlots parkingSlots:parkingFloor.getParkingSlots()){
                if(parkingSlots.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY) && parkingSlots.getVehicleType().equals(vehicleType))
                {

                    parkingSlots.setParkingSlotStatus(ParkingSlotStatus.FILLED);
                       return parkingSlots;

                }

            }
        }
        return null;
    }
}
