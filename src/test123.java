
public class test123 {
	
	
	public static void main(String[] args) {
		
		System.out.println(seq1(3));	//공차가 3인 등차수
		
	}
	public static int seq(int n) {
		if(n == 1) {
			return n;
		} else {
			return seq(n - 1) + 3;
		}
	}
	
	public static int seq1(int n) {
		if(n == 1) {
			return 0;
		}
		
				
		return (5 * seq1(n - 1)) + 3;
		
	}
}
