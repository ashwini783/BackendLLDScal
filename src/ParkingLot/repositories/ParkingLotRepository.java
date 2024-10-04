package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;

import java.util.TreeMap;

public class ParkingLotRepository {
    private TreeMap<Integer, ParkingLot> parkingLots=new TreeMap<>();

    public ParkingLot findParkingLotByEntryGate(Gate gateTocheck){
          for(ParkingLot parkingLot:parkingLots.values()){
              for(Gate gate: parkingLot.getEntryGates()){
                  if(gate.getId()==gateTocheck.getId()){
                      return parkingLot;
                  }
              }
          }
          return null;
    }
    public ParkingLot findParkingLotById(int parkingLotId){
        if(parkingLots.containsKey(parkingLotId)){
            return parkingLots.get(parkingLotId);
        }
        return null;
    }
}
//we will use Treemap for sorted data
