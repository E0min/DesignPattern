package Strategy.Behavior;

public class CanFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("하늘을 납니다 ");
    }
}
