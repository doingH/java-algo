package �ڷᱸ��;

import java.util.ArrayList;

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
		
	    Node newNode = new Node(input);
	    newNode.next = head;
	    head = newNode;
	    size++;
	    if(head.next == null){
	        tail = head;
	    }
	}
	public void addLast(Object input){
	    // ��带 �����մϴ�.
	    Node newNode = new Node(input);
	    if(size == 0){
	        addFirst(input);
	    } else {
	        tail.next = newNode;
	        tail = newNode;
	        size++;
	    }
	}
	
	
	
	Node node(int index) {
	    Node x = head;
	    for (int i = 0; i < index; i++)
	        x = x.next;
	    return x;
	}
	
	public void add(int k, Object input){
	    if(k == 0){
	        addFirst(input);
	    } else {
	        Node temp1 = node(k-1);
	        Node temp2 = temp1.next;
	        Node newNode = new Node(input);
	        temp1.next = newNode;
	        newNode.next = temp2;
	        size++;
	        if(newNode.next == null){
	            tail = newNode;
	        }
	    }
	}
	
	public String toString() {
		
	    if(head == null) {
	        return "[]";
	    }
	    
	    Node temp = head;
	    String str = "[";
	    while(temp.next != null){
	        str += temp.data + ",";
	        temp = temp.next;
	    }
	    str += temp.data;
	    return str+"]";
	}
	public Object removeFirst(){
	    // ù��° ��带 temp�� �����ϰ� head�� ���� �ι�° ���� �����մϴ�.
	    Node temp = head;
	    head = temp.next;
	    Object returnData = temp.data;
	    temp = null;
	    size--;
	    return returnData;
	}
	public Object remove(int k){
	    if(k == 0)
	        return removeFirst();
	    Node temp = node(k-1);
	    Node todoDeleted = temp.next;
	    temp.next = temp.next.next;
	    Object returnData = todoDeleted.data; 
	    if(todoDeleted == tail){
	        tail = temp;
	    }
	    todoDeleted = null; 
	    size--;
	    return returnData;
	}
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addFirst(1);
		list.addLast(3);
		list.add(1,2);
		
		System.out.println(list.toString());
	}
}
