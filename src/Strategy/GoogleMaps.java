package Strategy;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode){
        if(travelMode.equals(TravelMode.BIKE)){
            System.out.println("BIKE");
        }

        else if(travelMode.equals(TravelMode.WALK)){
            System.out.println("WALK");
        }
        else if(travelMode.equals(TravelMode.CAR)){
            System.out.println("CAR");
        }
    }
}
