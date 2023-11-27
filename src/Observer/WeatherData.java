package Observer;


import java.util.ArrayList;

public class WeatherData implements Subject {


    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;



    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementsChanged();
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

    @Override
    public void addObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(this);

        }

    }
    @Override
    public void deleteObservers(Observer o) {
        observers.remove(o);

    }
}
