package Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentDisplay=new CurrentConditionDisplay(weatherData);
        Observer staticsDisplay=new StatisticsDisplay(weatherData);
        Observer forecastDisplay=new ForCasteDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        System.out.println();

        weatherData.setMeasurements(82,70,29.2f);
        System.out.println();

        weatherData.setMeasurements(78,90,29.2f);

        currentDisplay.deregister();

//        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(62,90,28.1f);
    }
}
