package 디자인패턴.strategy.behavior.impl;

import 디자인패턴.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("조용합니다.");
	}
}