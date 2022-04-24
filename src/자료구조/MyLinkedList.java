package 자료구조;

public class MyLinkedList {
	
	private Node head;
    private Node tail;
    private int size = 0;
    
	private class Node {
		private Object data;
		private Node next;
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input){
		
	    // 노드를 생성합니다.
	    Node newNode = new Node(input);
	    // 새로운 노드의 다음 노드로 해드를 지정합니다.
	    newNode.next = head;
	    // 헤드로 새로운 노드를 지정합니다.
	    head = newNode;
	    size++;
	    if(head.next == null){
	        tail = head;
	    }
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addFirst(1);
		list.addFirst(2);
		System.out.println(list);
	}
}
