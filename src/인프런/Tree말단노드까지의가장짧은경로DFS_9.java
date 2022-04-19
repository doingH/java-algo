package 인프런;

//말단 노드 찾기
public class Tree말단노드까지의가장짧은경로DFS_9 {
	
	static Node root;
	public static int DFS(int L, Node root) {
		if(root.lt == null && root.rt == null) {
			return L;
		} else {
			int min = Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
			return min;
		}
	}
	
	public static void main(String[] args) {
		
		root=new Node(1); 
        root.lt=new Node(2); 
        root.rt=new Node(3); 
        root.lt.lt=new Node(4); 
        root.lt.rt=new Node(5); 
		
		System.out.println(DFS(0, root));
		
	}
}
