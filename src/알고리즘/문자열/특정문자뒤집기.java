package �˰���.���ڿ�;

public class Ư�����ڵ����� {
	
	public static void main(String[] args) {
		
		String str = "a#b!GE*T@S";
		char[] c = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt ++;
			} else if(!Character.isAlphabetic(c[rt])) {
				rt --;
			} else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		System.out.println(String.valueOf(c));
		
	}

}
