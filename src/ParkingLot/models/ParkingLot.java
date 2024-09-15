package ParkingLot.models;

import java.util.List;

public class ParkingLot extends  BaseModel {
    private String name;
    private List<ParkingFloor> parkingFloor;
    private  ParkingLotStatus parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGate;
    private List<SupportedVehicleType>vehicleTypes;

}
