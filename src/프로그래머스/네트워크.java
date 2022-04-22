package 프로그래머스;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class 네트워크 {
	public static ArrayList<ArrayList<Integer>> graphList = new ArrayList<ArrayList<Integer>>();
	public static int node = 0;
	public static int cnt = 0;
	public static Set<Integer> dup = new HashSet<Integer>();
	
	public static void DFS(int N) {
		if(graphList.get(N).size() == 0) {
			return;
		}
		
		for(int list : graphList.get(N)) {
			if(!dup.contains(list)) {
			dup.add(list);
			DFS(list);
			}
		}
		
	}


	public static void main(String[] args) {
		
//        1 1 1 
//        1 1 0
//        0 0 1
//            
//        
//        00 01 02
//        10 11 12
//        20 21 22
        
		
		int n = 3;
		node = n;
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		
		
		for (int i = 0; i < n; i++) {
			graphList.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < computers.length; i++) {
			for (int j = 0; j < computers[i].length; j++) {
				if(computers[i][j] == 1 && i != j) {
					graphList.get(i).add(j);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(!dup.contains(i)) {
				dup.add(i);
				DFS(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
