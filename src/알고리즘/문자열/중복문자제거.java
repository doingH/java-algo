package 알고리즘.문자열;

import java.util.HashSet;
import java.util.Set;

public class 중복문자제거 {
	public static void main(String[] args) {
		
		String str = "ksekkset";
		Set<String> dup = new HashSet<String>();
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			
			if(!dup.contains(String.valueOf(str.charAt(i)))) {
				dup.add(String.valueOf(str.charAt(i)));
				answer += String.valueOf(str.charAt(i));
			}
			
			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			
		}
		
		
		System.out.println(answer);
	}
}
