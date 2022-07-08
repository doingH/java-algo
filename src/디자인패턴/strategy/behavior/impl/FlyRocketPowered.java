package 디자인패턴.strategy.behavior.impl;

import 디자인패턴.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("로켓 추진으로 날아간다~!");
	}
}
