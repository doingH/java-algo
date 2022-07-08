package ����������.strategy.duck;

import ����������.strategy.behavior.impl.FlyWithWings;
import ����������.strategy.behavior.impl.Quack;

public class RedHeadDuck extends Duck {
	 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
