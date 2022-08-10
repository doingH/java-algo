package 디자인패턴.decorator;

public class HotSeasoning extends RamenDecorator {
	
	public HotSeasoning(Noodle noodle) {
		super(noodle);
	}
	
	@Override
    public void assemble() {
		super.assemble();
		System.out.print("매운 조미료 첨가. ");
    }
	
	
}


