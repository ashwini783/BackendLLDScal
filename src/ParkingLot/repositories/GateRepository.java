package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Optional;

public class GateRepository {

    //optinal means there can be chance of data wont be present
    public Optional<Gate> findGateById(int gateid){  //gate might be null also
        return Optional.empty();
//        select*from Gate where gate_id=gateid;

    }
}
//when you pull information out of row from DB it should be converted to object and this is done by ORM
//ORM-Object Relation Mapping -->Hibernate (pick a row from DB and convert that row into object--by Hibernate)  Hibernate is ORM