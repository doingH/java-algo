package ������.���ڿ�;

public class ���ڸ����� {
	public static void main(String[] args) {
		String str = "g0en2T0s8eSoft";
		char c[] = str.toCharArray();
		//�ƽ�Ű�ڵ� 48~57
		StringBuilder answer = new StringBuilder();
		StringBuilder answer2 = new StringBuilder();
		for(char list : c) {
			if(((int) list) >= 48 && ((int) list) <= 57) {
				answer.append(list);
			}
			if(Character.isDigit(list)) {
				answer2.append(list);
			}
		}
		
		
		System.out.println(Integer.parseInt(answer.toString()));
		System.out.println(Integer.parseInt(answer2.toString()));
	}
}
