package 구현;

public class 상하좌우 {
	public static void main(String[] args) {
		//LR는 Y 열
		//UD X 행
		int N = 5;
		String move[] = {"R","R","R","U","D","D"};
		int position[] = {1,1};
		for(String list : move) {
			
			//행
			if("U".equals(list)) {
				position[0]--;
			} else if("D".equals(list)) {
				position[0]++;
			} else if("L".equals(list)) {
				position[1]--;
			} else if("R".equals(list)) {
				position[1]++;
			}
			
		}
		
		System.out.println(position[0] + " " + position[1]);
		
	}
}

