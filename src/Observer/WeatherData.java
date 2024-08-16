package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer>observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("New Observer is generated");
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
       System.out.println("Observer is de-registered");
    }

    @Override
    public void notifyObservers() {
        System.out.println("********* Lets NOTIFY *******");
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }
    public void mesurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurementsChanged();

    }
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
