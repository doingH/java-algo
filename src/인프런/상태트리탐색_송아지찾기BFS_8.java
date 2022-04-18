package 인프런;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class 상태트리탐색_송아지찾기BFS_8 {
	
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(5);
		Set<Integer> pass = new HashSet<Integer>();
		pass.add(5);
		pass.equals(5);
		int availDis[] = {1, -1, 5};
		int jump = 0;
		int answer = 0;
		int level = 0;
//		System.out.println(level + " : " + queue.peek());
		while(!queue.isEmpty()) {
			if(answer > 0) {
				break;
			}
			int qlen = queue.size();
			
			System.out.print(level + " : ");
			
			level++;
			jump++;
			for (int i = 0; i < qlen; i++) {
				int dis = queue.poll();
				System.out.print(dis + " ");	
				for(int list : availDis) {
					
					if(!pass.contains(dis+list)) {
						//송아지 위치
						if(dis+list == 14) {
							answer = jump; 
						}
						queue.offer(dis+list);
						pass.add(dis+list);
					}
					
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println(answer);
		
	}
	
}
