package 디자인패턴.decorator;

public class OOPRamenStore {
	
	public static void main(String[] args) {
		
		//데코레이터 클라이언트
		final Noodle ramen = new Ramen();
        ramen.assemble();
        System.out.println();

        final Noodle shinRamen = new HotSeasoning(new Ramen());
        shinRamen.assemble();
        System.out.println();

        final Noodle raccoonRamen = new MooPaSeasoning(new Ramen());
        raccoonRamen.assemble();
        System.out.println();

        final Noodle shinRaccoonRamen = new HotSeasoning(new MooPaSeasoning(new Ramen()));
        shinRaccoonRamen.assemble();
        System.out.println();
        
	}
	
}
