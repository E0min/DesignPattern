package 전략패턴;

import Strategy.Behavior.Flyable;
import 전략패턴.DUCKSOUND.Cry;

public abstract class Duck {

    protected Cry cryable;
    protected Flyable flyable;
    public void fly(){
        flyable.fly();
    }
    public void cry(){
        cryable.cry();
    }
    public void swim(){
        System.out.println("둥둥 난 물에 뜬다네");
    }
    public abstract void display();
}
