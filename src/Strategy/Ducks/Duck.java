package Strategy.Ducks;

import Strategy.Behavior.Flyable;
import Strategy.Behavior.Quackable;

public abstract class Duck {
	protected Flyable flyable;
	protected Quackable quackable;
	public abstract void display(); // 추상
	public void fly(){
		flyable.fly();
	}
	public void quack(){
		quackable.quack();
	}

	public void swim() {
		System.out.println("All ducks float.");
	}

}
