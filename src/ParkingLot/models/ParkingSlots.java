package ParkingLot.models;

import java.util.List;

public class ParkingSlots extends  BaseModel{
    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<SupportedVehicleType> vehicleTypes;

}
