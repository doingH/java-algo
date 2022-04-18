
public class 일이될때까지 {
	
	public static void main(String[] args) {
		int N = 25;
		int K = 3;
		
		int minCnt = 0;
		while(true) {
			if(N == 1) {
				break;
			}
			if(N % K == 0) {
				N = N/K;
			} else {
				N--;
			}
			minCnt++;
		}
		
		System.out.println(minCnt);
		
	}

}
