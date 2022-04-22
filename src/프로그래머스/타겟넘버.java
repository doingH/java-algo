package 프로그래머스;

public class 타겟넘버 {
	
    int target = 0;
	int[] numbers = {};
	static int sum = 0;
	int answer = 0;
    
    public void DFS(int N) {
		
		if(N == numbers.length) {
			
			if(sum == target) {
				answer++;
			}
			return;
		}
		
		sum += numbers[N];
		DFS(N+1);
		sum -= numbers[N];
		
		sum -= numbers[N];
		DFS(N+1);
		sum += numbers[N];
		
		
	}
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        DFS(0);
        return this.answer;
    }
    
    public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		System.out.println(new 타겟넘버().solution(numbers, 3));
	}
}
