package Strategy.Ducks;

import Strategy.Behavior.CanFly;
import Strategy.Behavior.Flyable;
import Strategy.Behavior.Quack;
import Strategy.Behavior.Quackable;

public class RedHeadDuck extends Duck implements Quackable, Flyable {
	public RedHeadDuck() {
		flyable = new CanFly();
		quackable = new Quack();
	}

	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
