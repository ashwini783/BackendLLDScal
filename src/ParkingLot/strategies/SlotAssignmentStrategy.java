package ParkingLot.strategies;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlots;
import ParkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlots assignSlot(ParkingLot parkingLot, VehicleType vehicleType);

}
