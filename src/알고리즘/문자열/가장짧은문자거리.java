package 알고리즘.문자열;

import java.util.Hashtable;

public class 가장짧은문자거리 {
	
	public static void main(String[] args) {
		
		String str = "teachermode";
		char t = 'e';
		
		int idx = 0;
		char c[] = str.toCharArray();
		
		for(int i=0; i<c.length; i++) {
			
			int post = 0;
			int pre = 0;
			for (int j = i; j < str.length(); j++) {
				
				if(c[j] == t) {
					break;
				}
				post++;
				
			}
			
//			for (int j = i; j >= 0; j--) {
//				if(c[j] == t) {
//					break;
//				}
//				pre++;
//			}
			
			for (int j = i; j < post; j--) {
				
			}
			System.out.print(post < pre ? post + " " : pre + " ");
		}
		
		//Hashtable<K, V>
		
	}
}
