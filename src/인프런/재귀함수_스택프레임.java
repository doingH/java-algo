package 인프런;

public class 재귀함수_스택프레임 {
	public static void DFS(int n) {
		if(n==0) return;
		else {
			//스텍 프레임 내에서 상단의 스텍먼저 작동한다.
			System.out.println(n);
			DFS(n-1);
			// DFS가 리턴되는 순간 복귀 라인 9부터 다시 시작된다.
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		DFS(3);
	}
	
}
