package 디자인패턴.strategy.duck;

import 디자인패턴.strategy.behavior.FlyBehavior;
import 디자인패턴.strategy.behavior.QuackBehavior;
import 디자인패턴.strategy.behavior.impl.FlyNoWay;

public class RubberDuck extends Duck {
	 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("Squeak");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}