package 디자인패턴.factory.decorator;

//누들 인터페이스를 구현하고
public class RamenDecorator implements Noodle {
	
	//누들 인터페이스를 멤머변수로 선언
    private Noodle noodle;

    //생성자 주입을 통해 누들 인터페이스에 구현체를 주입
    public RamenDecorator(final Noodle noodle) {
        this.noodle = noodle;
    }

    @Override
    public void assemble() {
    	//구현체마다 다르게 구현된 assemble 메소드를 호출
        noodle.assemble();
    }
}