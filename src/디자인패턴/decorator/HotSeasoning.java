package ����������.decorator;

public class HotSeasoning extends RamenDecorator {
	
	public HotSeasoning(Noodle noodle) {
		super(noodle);
	}
	
	@Override
    public void assemble() {
		super.assemble();
		System.out.print("�ſ� ���̷� ÷��. ");
    }
	
	
}


