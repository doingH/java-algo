package ����������.decorator;

public class RamenStore {
	
	public static void main(String[] args) {
		
		//�Ϲ� ��� Ŭ���̾�Ʈ
		Ramen ramen = new ShinRamen();
		ramen.assemble();
		System.out.println();
		
		ramen = new MooPaMaRamen();
		ramen.assemble();
		System.out.println();
		
	}
	
}
