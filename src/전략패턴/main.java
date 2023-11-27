package 전략패턴;

public class main {
    public static void main(String[] args) {
        Duck mallar = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck red = new RedHeadDuck();

        red.display();
        red.cry();
        red.fly();
        red.swim();

        rubber.display();
        rubber.cry();
        rubber.fly();
        rubber.swim();

        mallar.display();
        mallar.cry();
        mallar.fly();
        mallar.swim();

    }
}
