package Observer;

import Observer.Display;
import Observer.Observer;

public class currentDisplay implements Display, Observer {
    WeatherData data;

    @Override
    public void update(WeatherData data) {
        this.data = data;
        display();
    }

    public void display(){
        System.out.println("과거 통계"+data);
    }
}
