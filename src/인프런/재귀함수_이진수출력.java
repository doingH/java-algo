package ������;

public class ����Լ�_��������� {
	public static void DFS(int N) {
		
		if(N == 0) {
//			System.out.print(N);
			return;
		}
		System.out.println(N);
		DFS(N / 2);
		System.out.print(N % 2);
		
		
		return;
	}
	
	public static void main(String[] args) {
		
		int N = 11;
		
		DFS(N);
		
		
	}
	
}
