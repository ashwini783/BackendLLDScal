package ParkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private String floorNumber;
    private List<ParkingSlots> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<SupportedVehicleType> vehicleTypes;
}
