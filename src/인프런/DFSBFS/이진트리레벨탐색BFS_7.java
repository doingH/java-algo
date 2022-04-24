package ������.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}
public class ����Ʈ������Ž��BFS_7 {
	static Node root;
	public static void BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();
		
		Q.offer(root);
		int level=1;
		while(!Q.isEmpty()) {
			
			System.out.print(level + " : ");
			int len = Q.size();	//����� �̸� �����Ͽ� ����� �þ �� ��ġ �ʴ� ����� �߻� ����
			level++;
			for (int i = 0; i < len; i++) {
				Node node = Q.poll();
				System.out.print(node.data + " ");
				if(node.lt != null) {
					Q.offer(node.lt);
				}
				if(node.rt != null) {
					Q.offer(node.rt);
				}
				
			}
			
			System.out.println();
			
			
		}
		
		
	}
	public static void main(String[] args) {
		
		root=new Node(1); 
		root.lt=new Node(2);
		root.rt=new Node(3);
		root.lt.lt=new Node(4);
		root.lt.rt=new Node(5);
		root.rt.lt=new Node(6);
		root.rt.rt=new Node(7);
		
		BFS(root);
		
	}
	
}
