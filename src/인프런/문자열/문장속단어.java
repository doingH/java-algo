package ������.���ڿ�;

import java.util.StringTokenizer;

public class ����Ӵܾ� {
	
	public static void main(String[] args) {
		//���� �� �ܾ�
		
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
