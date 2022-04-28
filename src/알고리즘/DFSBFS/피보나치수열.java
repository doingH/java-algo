package 알고리즘.DFSBFS;

public class 피보나치수열 {
	
	static int[] fibo;
	public static int DFS(int N) {

		//메모이제이션
		if(fibo[N] != 0) {
			return fibo[N];
		}
		
		if(N == 1 || N == 2) {
			fibo[N] = 1;
			return 1;
		}
		int a = DFS(N-2);
		int b = DFS(N-1);
		
		return fibo[N] = a+b;
	}
	
	public static void main(String[] args) {
		
		int N = 1000;
		fibo = new int[N+1];
		DFS(N);
		for (int i = 1; i <= N; i++) {
			System.out.println(fibo[i]);
		}
		
	}
	//1 1 2 3 5 8
}
