package 인프런;

public class 재귀함수_이진수출력 {
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
