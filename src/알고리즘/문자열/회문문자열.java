package 알고리즘.문자열;

public class 회문문자열 {
	
	public static void main(String[] args) {
		String str = "gooG";
		str = str.toLowerCase();
		int lt = 0;
		int rt = str.length()-1;
		char c[] = str.toCharArray();
		String answer = "yes";
		while(lt < rt) {
			if(c[lt] != c[rt]) {
				answer = "no";
			}
			lt++;
			rt--;
		}
		System.out.println(answer);
		
	}
}
