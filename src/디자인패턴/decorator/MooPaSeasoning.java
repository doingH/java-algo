package ����������.decorator;

public class MooPaSeasoning extends RamenDecorator {
	
	public MooPaSeasoning(Noodle noodle) {
		super(noodle);
	}
	
	@Override
    public void assemble() {
		super.assemble();
		System.out.print("���� �ĸ� ÷��. ");
    }
	
}


