package 디자인패턴.strategy.duck;

import 디자인패턴.strategy.behavior.impl.FlyWithWings;
import 디자인패턴.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
