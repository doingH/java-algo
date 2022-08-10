package 디자인패턴.decorator;

public class RamenStore {
	
	public static void main(String[] args) {
		
		//일반 상속 클라이언트
		Ramen ramen = new ShinRamen();
		ramen.assemble();
		System.out.println();
		
		ramen = new MooPaMaRamen();
		ramen.assemble();
		System.out.println();
		
	}
	
}
