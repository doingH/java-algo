package 디자인패턴.decorator;

public class MooPaSeasoning extends RamenDecorator {
	
	public MooPaSeasoning(Noodle noodle) {
		super(noodle);
	}
	
	@Override
    public void assemble() {
		super.assemble();
		System.out.print("무와 파를 첨가. ");
    }
	
}


