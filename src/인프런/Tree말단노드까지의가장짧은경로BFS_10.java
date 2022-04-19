package 인프런;

import java.util.LinkedList;
import java.util.Queue;

//말단 노드 찾기
public class Tree말단노드까지의가장짧은경로BFS_10 {
	
	static Node root;
	public static int BFS(Node root) {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		int answer = 0;
		int level = 0;
		while(!queue.isEmpty()) {
			
			int len = queue.size();
			Node curNode = queue.peek();
			if(answer > 0) {
				break;
			}
			
			for (int i = 0; i < len; i++) {
				curNode = queue.poll();
				if(curNode.lt == null && curNode.rt == null) {
					answer = level;
					break;
				}
				
				if(curNode.lt != null) {
					queue.offer(curNode.lt);
				}
				
				if(curNode.rt != null) {
					queue.offer(curNode.rt);
				}
				
			}
			
			level++;
			
		}
		
		
		System.out.println(answer);
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		root=new Node(1); 
        root.lt=new Node(2); 
        root.rt=new Node(3); 
        root.lt.lt=new Node(4); 
        root.lt.rt=new Node(5); 
		
		BFS(root);
		
	}
}
