package Strategy.Ducks;

import Strategy.Behavior.CanFly;
import Strategy.Behavior.Flyable;
import Strategy.Behavior.Quack;
import Strategy.Behavior.Quackable;

public class MallardDuck extends Duck implements Quackable, Flyable {
	public MallardDuck() {
		flyable = new CanFly();
		quackable = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
