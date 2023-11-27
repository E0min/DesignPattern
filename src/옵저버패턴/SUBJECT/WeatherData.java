package 옵저버패턴.SUBJECT;

import 옵저버패턴.OBSERVER.Observer;
import 옵저버패턴.SUBJECT.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    ArrayList<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {nofity();}

    @Override
    public void register(Observer o){
        observers.add(o);
    }

    @Override
    public void nofity() {
        for(Observer o:observers){
            o.update(temperature,humidity,pressure);
        }
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
    public float getTemperature() {return temperature;}
    public float getHumidity() {return humidity;}
    public float getPressure() {return pressure;}
}
