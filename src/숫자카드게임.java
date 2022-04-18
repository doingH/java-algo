
public class 숫자카드게임 {
	
	public static void main(String[] args) {

		int row = 2;
		int col = 4;
		int arr[][] = {{7,3,1,8},{3,3,3,4}};
		
		int rowMin[] = new int[row];
		
		for(int i=0; i<row; i++) {
			rowMin[i] = 0;
			for(int j=0; j<row; j++) {
				if(j == 0) {
					rowMin[i] = arr[i][j];
				}
				if(arr[i][j] < rowMin[i]) {
					rowMin[i] = arr[i][j];
				}
			}
		}
		int max = 0;
		for(int list : rowMin) {
			if(max < list) {
				max = list;
			}
		}
		System.out.println(max);
	}
}
