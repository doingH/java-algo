package 인프런;

import java.util.LinkedList;

public class 부분집합구하기DFS_6 {
	
	static int n;
	static int[] check;
	public static void DFS(int L) {
		
		if(L==n+1) {
			
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if(check[i]==1) tmp += i + " ";
			}
			System.out.println(tmp);
			
		} else {
			check[L] = 1;
			DFS(L+1);
			check[L] = 0;
			DFS(L+1);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		LinkedList
		n=3;
		check = new int[n+1];
		DFS(1);
		
  	}
	
}
