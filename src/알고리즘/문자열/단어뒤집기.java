package �˰���.���ڿ�;

public class �ܾ������ {
	public static void main(String[] args) {
		
		String str = "study";
		
		String temp = new StringBuilder(str).reverse().toString();
//		System.out.println(temp);
		
		
		char c[] = str.toCharArray();
		int l = 0;
		int r = c.length-1;
		while(l < r) {
			char ctemp = c[l];
			c[l] = c[r];
			c[r] = ctemp;
			l++;
			r--;
		}
		
		for(char list : c) {
			System.out.print(list);
		}
		
		
		
	}
}
