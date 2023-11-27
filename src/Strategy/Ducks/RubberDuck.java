package Strategy.Ducks;

import Strategy.Behavior.*;

public class RubberDuck extends Duck implements Flyable, Quackable {
    /*
    Duck과 이렇게 다른데 RubberDuck은 상속 받는 것이 맞는가???
     */

    public RubberDuck(){
        flyable = new CannotFly();
        quackable = new Squack();
    }
    public void display() {
        System.out.println("저는 고무오리입니다.");
    }
}
