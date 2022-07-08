package 디자인패턴.strategy.behavior.impl;

import 디자인패턴.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("날고 있다~!");
	}
}
