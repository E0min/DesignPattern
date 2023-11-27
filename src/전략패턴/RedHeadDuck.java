package 전략패턴;

import Strategy.Behavior.CanFly;
import 전략패턴.DUCKSOUND.quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyable = new CanFly();
        cryable = new quack();
    }
    public void display(){
        System.out.println("안녕하세요 저는 RedHeadDuck입니다.");
    }
}
