package Observer;

import Observer.forecastDisplay;

public class main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        Observer cd = new currentDisplay();
        Observer fd = new forecastDisplay();
        Observer sd = new statisticDisplay();

        data.setMeasurements(21,21,22);

        data.addObservers(cd);
        data.addObservers(fd);
        data.addObservers(sd);

        data.setHumidity(14);
        data.setTemperature(15);
        data.setPressure(50);


    }
}
