package ����������.decorator;

public class OOPRamenStore {
	
	public static void main(String[] args) {
		
		//���ڷ����� Ŭ���̾�Ʈ
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
