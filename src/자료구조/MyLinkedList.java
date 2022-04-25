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
	public void addLast(Object input){
	    // 노드를 생성합니다.
	    Node newNode = new Node(input);
	    // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용합니다.
	    if(size == 0){
	        addFirst(input);
	    } else {
	        // 마지막 노드의 다음 노드로 생성한 노드를 지정합니다.
	        tail.next = newNode;
	        // 마지막 노드를 갱신합니다.
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
	    // 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
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
	    if(head == null){
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
	    // 첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경합니다.
	    Node temp = head;
	    head = temp.next;
	    // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담습니다. 
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
