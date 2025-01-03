package ParkingLot.models;

import java.util.List;

public class ParkingLot extends  BaseModel {
    private String name;
    private List<ParkingFloor> parkingFloor;
    private  ParkingLotStatus parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGate;
    private List<SupportedVehicleType>vehicleTypes;
    private SlotAssignmentStrategyType slotAssignmentStrategyType;

    public SlotAssignmentStrategyType getSlotAssignmentStrategyType() {
        return slotAssignmentStrategyType;
    }

    public void setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }



    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGate() {
        return exitGate;
    }

    public void setExitGate(List<Gate> exitGate) {
        this.exitGate = exitGate;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
