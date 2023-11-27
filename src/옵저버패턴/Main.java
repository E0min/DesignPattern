package 옵저버패턴;

import 옵저버패턴.OBSERVER.Observer;
import 옵저버패턴.OBSERVER.TodayWeather;
import 옵저버패턴.OBSERVER.TommorrowWeather;
import 옵저버패턴.OBSERVER.YesterdayWeather;
import 옵저버패턴.SUBJECT.Subject;
import 옵저버패턴.SUBJECT.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherServer = new WeatherData();

        Observer today = new TodayWeather(); // new Observer가 안되는 이유는 인터페이스는 구현이 없어서 인스턴스화 안댐
        Observer tommorow = new TommorrowWeather();
        Observer yesterday = new YesterdayWeather();


        weatherServer.register(today);
        weatherServer.register(tommorow);
        weatherServer.register(yesterday);
        weatherServer.setMeasurements(10,20,30);

        weatherServer.setHumidity(500);
        weatherServer.setPressure(100000);
        weatherServer.setPressure(1);
         // today.display(); 인터페이스형으로 구현한다면 인터페이스로 구현한 메소드만 사용 가능하다. 그래서 Subject 타입이 아니라 WeatherData

    }
}
