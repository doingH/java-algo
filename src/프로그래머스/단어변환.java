package 프로그래머스;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class 단어변환 {
	
	public int solution(String begin, String target, String[] words) {

		boolean has = false;
		for(String list : words) {
			if(target.equals(list)) {
				has = true;
			}
		}
		if(!has) {
			return 0;
		}
		
		
        Queue<String> queue = new LinkedList<String>();
        Set<String> dup = new HashSet<String>();
        
        int answer = 0;
        
        dup.add(begin);
        queue.offer(begin);
        
        int level = 0;
        while(!queue.isEmpty()) {
        	if(queue.peek().equals(target)) {
        		answer = level;
        		break;
        	}
        	
        	System.out.print(queue.peek() + " ");
        	
        	int len = queue.size();
        	level++;
        	
        	for (int i = 0; i < len; i++) {
        		String beginStr = queue.poll();
        		for(String word : words) {
        			
        			int equalsCnt = 0;
        			for (int j = 0; j < word.length(); j++) {
        				if(word.charAt(j) == beginStr.charAt(j)) {
        					equalsCnt++;
        				}
        				
//        				if(word.indexOf(beginStr.charAt(i)) > 0) {
//        					equalsCnt++;
//        				}
					}
                    
        			if(equalsCnt == target.length()-1 && !dup.contains(word)) {
        				dup.add(word);
        				queue.offer(word);
        			}
        				
        		}
        		
			}
        	
        	
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String begin = "hit";
		String target = "cog";
		String words[] = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		int answer = new 단어변환().solution(begin, target, words);
		System.out.println(answer);
		
	}
}
