package Observer;

import Observer.Display;
import Observer.Observer;

public class statisticDisplay implements Display, Observer {
    WeatherData data;

    @Override
    public void update(WeatherData data) {
        this.data = data;
        display();
    }

    @Override
    public void display(){
        System.out.println("과거 통계"+data);
    }
}
