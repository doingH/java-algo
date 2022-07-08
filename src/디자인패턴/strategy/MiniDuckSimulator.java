package ����������.strategy;

import ����������.strategy.behavior.impl.FlyRocketPowered;
import ����������.strategy.behavior.impl.MuteQuack;
import ����������.strategy.duck.Duck;
import ����������.strategy.duck.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		//MallardDuck���� 
		mallard.performQuack();	//�� ��
		mallard.performFly();	//���� �ִ�~!
		//������ �ൿ�� setter�޼ҵ带 ���� �ٷιٷ� �ٲ� �� �ִ�.
		
		mallard.setQuackBehavior(new MuteQuack());
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performQuack();	//�����մϴ�.
		mallard.performFly();	//���� �������� ���ư���~!
		
		
	}
}