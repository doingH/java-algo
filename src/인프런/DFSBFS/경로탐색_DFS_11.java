package 인프런.DFSBFS;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 경로탐색_DFS_11 {
	
	static int graph[][];
	static int check[][];
	static int cnt = 0;
	static Set<Integer> dup = new HashSet<Integer>();
	static int path[] = new int[5];
	
	public static void DFS(int L, int N) {
		if(N == 5) {
			cnt++;
			for(int list : path) {
				if(list > 0) {
					System.out.print(list + " ");
				}
			}
			System.out.println();
			return;
		}
		
		for (int i = 1; i <= graph[N].length-1; i++) {
			
			if(graph[N][i] == 1 && !dup.contains(i)) {
				dup.add(i);
				path[L] = i;
				DFS(L+1, i);
				dup.remove(i);
				path[L] = 0;
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		graph = new int[6][6];
		graph[1][2] = 1;
		graph[1][3] = 1;
		graph[1][4] = 1;
		graph[2][1] = 1;
		graph[2][3] = 1;
		graph[2][5] = 1;
		graph[3][4] = 1;
		graph[4][2] = 1;
		graph[4][5] = 1;
		dup.add(1);
		path[0] = 1;
		DFS(1, 1);
		System.out.println(cnt);
		
	}
	
}
