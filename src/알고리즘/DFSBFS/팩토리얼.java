package �˰���.DFSBFS;

public class ���丮�� {
	
	public static int DFS(int N) {
		
		if(N == 1) {
			return N;
		}
		
		return N * DFS(N-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(DFS(5));
		
	}
}
