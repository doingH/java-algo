package 디자인패턴.decorator;

public class ShinRamen extends Ramen {

    @Override
    public void assemble() {
    	super.assemble();
        System.out.print("매운 조미료가 들어간다.");
    }
    
}