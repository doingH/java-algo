package �׽�Ʈ;

public class �űԾ��̵���õ {
	public static void main(String[] args) {
		/*
		���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�.
		���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
		��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
		*/
		String new_id = "z-+.^.";
		
		//�ʱ�ܰ�
		System.out.println(new_id);
		//1�ܰ�
		new_id = new_id.toLowerCase();
		System.out.println(new_id);
		
		//2�ܰ�
		new_id = new_id.replaceAll("[^ a-z0-9-_.]", "");
		System.out.println(new_id);
		
		//3�ܰ�
		new_id = new_id.replaceAll("[.]{2,}", ".");
		System.out.println(new_id);
		
		//4�ܰ�
		//^x : ���ڿ��� x�� ����
		//x$ : ���ڿ��� x�� ����
		new_id = new_id.replaceAll("^[.]|[.]$","");    //4�ܰ�

		System.out.println(new_id);
		
		//5�ܰ�
		if("".equals(new_id)) {
			new_id += "a";
		}
		System.out.println(new_id);
		
		//6�ܰ�
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("[.]$", "");
		}
		System.out.println(new_id);
		
		//7�ܰ�
		if(new_id.length() <= 2) {
			while(true) {
				new_id += new_id.substring(new_id.length()-1, new_id.length());
				if(new_id.length() == 3) {
					break;
				}
			}
		}
		System.out.println(new_id);
		
	}
}
