package 인프런.문자열;

public class 숫자만추출 {
	public static void main(String[] args) {
		String str = "g0en2T0s8eSoft";
		char c[] = str.toCharArray();
		//아스키코드 48~57
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
