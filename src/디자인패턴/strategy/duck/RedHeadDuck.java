package 디자인패턴.strategy.duck;

import 디자인패턴.strategy.behavior.impl.FlyWithWings;
import 디자인패턴.strategy.behavior.impl.Quack;

public class RedHeadDuck extends Duck {
	 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
