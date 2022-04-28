package 알고리즘.DFSBFS;

public class 이진트리순회 {
	
/*
 * 깊이 우선 탐색
 * 
 * 전위순회 부모-왼-오
 * 중위순회 왼-부-오
 * 후위순회 왼-오-부
 * 
 * */
	
	static Node root;
	public static void DFS(Node root) {
		if(root == null) return;
		
		System.out.print(root.data + " ");	//전위순회
		DFS(root.lt);
//		System.out.print(root.data + " ");	//중위순회
		DFS(root.rt);
//		System.out.print(root.data + " ");	//후 위순회
		
	}
	public static void main(String[] args) {

        root=new Node(1); 
        root.lt=new Node(2); 
        root.rt=new Node(3); 
        root.lt.lt=new Node(4); 
        root.lt.rt=new Node(5); 
		root.rt.lt=new Node(6); 
        root.rt.rt=new Node(7);
        
        DFS(root);
        
	}
	
}
