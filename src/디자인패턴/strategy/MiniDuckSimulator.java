package 디자인패턴.strategy;

import 디자인패턴.strategy.behavior.impl.FlyRocketPowered;
import 디자인패턴.strategy.behavior.impl.MuteQuack;
import 디자인패턴.strategy.duck.Duck;
import 디자인패턴.strategy.duck.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		//MallardDuck에서 
		mallard.performQuack();	//꽥 꽥
		mallard.performFly();	//날고 있다~!
		//오리의 행동을 setter메소드를 통해 바로바로 바꿀 수 있다.
		
		mallard.setQuackBehavior(new MuteQuack());
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performQuack();	//조용합니다.
		mallard.performFly();	//로켓 추진으로 날아간다~!
		
		
	}
}