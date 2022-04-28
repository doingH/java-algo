package �˰���.DFSBFS;

public class �Ǻ���ġ���� {
	
	static int[] fibo;
	public static int DFS(int N) {

		//�޸������̼�
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
