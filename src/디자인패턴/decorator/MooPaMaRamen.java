package 디자인패턴.decorator;

public class MooPaMaRamen extends Ramen {

    @Override
    public void assemble() {
    	super.assemble();
        System.out.print("무와 파가 들어간 조미료가 들어간다.");
    }
    
}