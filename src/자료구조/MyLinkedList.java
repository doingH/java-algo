package �ڷᱸ��;

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
		
	    // ��带 �����մϴ�.
	    Node newNode = new Node(input);
	    // ���ο� ����� ���� ���� �ص带 �����մϴ�.
	    newNode.next = head;
	    // ���� ���ο� ��带 �����մϴ�.
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
