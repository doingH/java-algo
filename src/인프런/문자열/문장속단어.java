package 인프런.문자열;

import java.util.StringTokenizer;

public class 문장속단어 {
	
	public static void main(String[] args) {
		//가장 긴 단어
		
		String sentence = "it is time to study";
		StringTokenizer stringToken = new StringTokenizer(sentence, " ");
		int maxLength = Integer.MIN_VALUE;
		String maxLengthWord = "";
		while(stringToken.hasMoreTokens()) {
			String temp = stringToken.nextToken();
			if(maxLength < temp.length()) {
				maxLengthWord = temp;
			}
		}
		System.out.println(maxLengthWord);
	}
}
