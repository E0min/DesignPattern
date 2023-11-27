package 전략패턴;

import Strategy.Behavior.CannotFly;
import 전략패턴.DUCKSOUND.squack;

public class RubberDuck extends Duck{
        public RubberDuck(){
            flyable = new CannotFly();
            cryable = new squack();
        }
        public void display(){
            System.out.println("저는 rubber Duck입니다.");
        }


}
