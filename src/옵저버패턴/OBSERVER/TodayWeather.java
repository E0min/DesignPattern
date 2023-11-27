package 옵저버패턴.OBSERVER;

public class TodayWeather implements Observer,Display {
    float temperature;
    float humidity;
    float pressure;
    @Override
    public void screen(){
        System.out.println("오늘의 날씨 입니다.");
        System.out.println("기온"+temperature);
        System.out.println("기압"+pressure);
        System.out.println("습도"+humidity);

    }
    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        screen();
    }
}
