package 디자인패턴.strategy.behavior.impl;

import 디자인패턴.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("저는 못 날아요!~!");
	}
}
