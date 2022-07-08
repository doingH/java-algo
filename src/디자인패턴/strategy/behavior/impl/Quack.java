package 디자인패턴.strategy.behavior.impl;

import 디자인패턴.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("꽥 꽥");
	}
}