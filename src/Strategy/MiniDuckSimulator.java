package Strategy;

import Strategy.Ducks.Duck;
import Strategy.Ducks.MallardDuck;
import Strategy.Ducks.RedHeadDuck;
import Strategy.Ducks.RubberDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.quack();
		mallard.fly();
		mallard.swim();
   
		Duck redHead = new RedHeadDuck();
		redHead.display();
		redHead.quack();
		redHead.fly();
		redHead.swim();

		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.quack();
		rubber.fly();
		rubber.swim();

	}
}
