package 디자인패턴.strategy.behavior.impl;

import 디자인패턴.strategy.behavior.QuackBehavior;

public class Squack implements QuackBehavior {
	public void quack() {
		System.out.println("삑삑삑");
	}
}