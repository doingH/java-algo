package 인프런;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class 경로탐색_인접리스트_BFS_12 {
	
	static int graph[][];
	static int check[][];
	static int cnt = 0;
	static Set<Integer> dup = new HashSet<Integer>();
	static ArrayList<ArrayList<Integer>> graphList = new ArrayList<ArrayList<Integer>>(); 
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
		
		int i=1;
		for(int list : graphList.get(N)) {
			
			if(!dup.contains(list)) {
				dup.add(list);
				path[L] = list;
				DFS(L+1, list);
				dup.remove(list);
				path[L] = 0;
			}
		}
			
			
		
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		int m = 9;
		int nodes[][] = {{1,2}, {1,3}, {1,4}, {2,1}, {2,3}, {2,5}, {3,4}, {4,2}, {4,5}};
		for (int i = 0; i <= n; i++) {
			graphList.add(new ArrayList<Integer>());
		}
		for(int[] list : nodes) {
			graphList.get(list[0]).add(list[1]);
		}
		
		dup.add(1);
		path[0] = 1;
		DFS(1, 1);
		System.out.println(cnt);
		
	}
	
}
