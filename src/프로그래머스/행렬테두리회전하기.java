package 프로그래머스;

public class 행렬테두리회전하기 {
	
	public static void main(String[] args) {
		
		int rows = 100;
		int columns = 97;
		int[][] queries = {{1,1,100,97}};
		int[] answer = new int[queries.length];
		
		int arr[][] = new int[rows][columns];
		int num = 1;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				arr[i][j] = num;
				num++;
			}	
		}
		
		int len = queries.length;
		
		for(int i=0; i<len; i++) {
			int startX = queries[i][0];
			int startY = queries[i][1];
			int endX = queries[i][2];
			int endY = queries[i][3];
			startX--;
			startY--;
			endX--;
			endY--;
			int min = arr[startX][startY];
			int temp1 = arr[startX][startY];
			for(int j=startY; j<=endY; j++) {
				int temp = arr[startX][j];
				arr[startX][j] = temp1;
				temp1 = temp;
				if(min > temp1) {
					min = temp1;
				}
			}
			
			
			for(int j=startX+1; j<=endX; j++) {
				int temp = arr[j][endY];
				arr[j][endY] = temp1;
				temp1 = temp;
				if(min > temp1) {
					min = temp1;
				}
			}
			
			for(int j=endY-1; j>=startY; j--) {
				int temp = arr[endX][j];
				arr[endX][j] = temp1;
				temp1 = temp;
				if(min > temp1) {
					min = temp1;
				}
			}
			
			for(int j=endX-1; j>=startX; j--) {
				int temp = arr[j][startY];
				arr[j][startY] = temp1;
				temp1 = temp;
				if(min > temp1) {
					min = temp1;
				}
			}
			
			answer[i] = min;
			System.out.println(min);
		}
			
		
	}

}
