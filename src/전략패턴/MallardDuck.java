package 전략패턴;

import Strategy.Behavior.CanFly;
import 전략패턴.DUCKSOUND.quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyable = new CanFly();
        cryable = new quack();
    }
    public void display(){
        System.out.println("저는 mallard Duck입니다.");
    }
}
