package �ڷᱸ��;

import java.util.Arrays;
import java.util.EmptyStackException;

interface StackInterface<E> {
	
	//������ �� ���� ��Ҹ� �߰� 
	E push(E item);
	
	//������ �� ���� �ִ� ��Ҹ� �����ϰ� ���� �� ��Ҹ� ��ȯ�մϴ�.
	E pop();
	
	//������ �� ���� �ִ� ��Ҹ� �������� �ʰ� ��ȯ�մϴ�.
	E peek();
	
	//������ ��� ���� Ư�� ��Ұ� �� ��° ��ġ�� �ִ����� ��ȯ
	//��ġ�� ���� 1���� ����
	int search(Object value);
	
	//������ ��� ������ ��ȯ�մϴ�.
	int size();
	
	//���ÿ� �ִ� ��� ��Ҹ� ����
	void clear();
	
	//���ÿ� ��Ұ� ����ִ����� ��ȯ�մϴ�.
	boolean empty();
}

public class MyStack<E> implements StackInterface<E>{
		 
		private static final int DEFAULT_CAPACITY = 10;	// �ּ�(�⺻) ���� ũ�� 
		private static final Object[] EMPTY_ARRAY = {};	// �� �迭 
		
		private Object[] array;	// ��Ҹ� ���� �迭  
		private int size;	// ��� ����
		
		@Override
		public boolean empty() {
			return size == 0;
		}
		
		@Override
		public void clear() {
				
			// ����Ǿ��ִ� ��� ��Ҹ� null ó�� ���ش�.
			for(int i = 0; i < size; i++) {
				array[i] = null;
			}
			size = 0;
			resize();
		}
		
		@Override
		public int size() {
			return size;
		}
		@Override
		public int search(Object value) {
			
			for(int idx = size - 1; idx >= 0; idx--) {
		 
				// ���� ��ü�� ã���� ��� size - idx ���� ��ȯ 
				if(array[idx].equals(value)) {
					return size - idx;
				}
			}
			return -1;
		}
		
		@Override
		public E peek() {
			// ���� ������ ��Ұ� ���ٸ� Stack�� ����ִٴ� �ǹ��̹Ƿ� ���� �߻���Ű��
			if(size == 0) {
				throw new EmptyStackException();
			}
				
			return (E) array[size - 1];
		}
		@Override
		public E pop() {
				
			// ���� ������ ��Ұ� ���ٸ� Stack�� ����ִٴ� �ǹ��̹Ƿ� ���� �߻���Ű��
			if(size == 0) {
				throw new EmptyStackException();
			}
				
			@SuppressWarnings("unchecked")
			E obj = (E) array[size - 1];	// ������ ��Ҹ� ��ȯ�ϱ� ���� �ӽ� ���� 
				
			array[size - 1] = null;	// ��� ���� 
				
			size--;	// ������ 1 ���� 
			resize();	// ���� ���Ҵ� 
				
			return obj;
		}
		
		@Override
		public E push(E item) {
				
			// ������ �� ���ִٸ� ������ ���Ҵ� ���ش�. 
			if (size == array.length) {
				resize();
			}
			array[size] = item;	// ������ ��ġ�� ��� �߰� 
			size++;	// ������ 1 ���� 
				
			return item;
		}
		
		// ������1 (�ʱ� ���� �Ҵ� X) 
		public MyStack() {
			this.array = EMPTY_ARRAY;
			this.size = 0;
		}
		
		// ������2 (�ʱ� ���� �Ҵ� O) 
		public MyStack(int capacity) {
			this.array = new Object[capacity];
			this.size = 0;
		}
		private void resize() {
			
			// �� �迭�� ��� (capacity is 0)
			if(Arrays.equals(array, EMPTY_ARRAY)) {
				array = new Object[DEFAULT_CAPACITY];
				return;
			}
				
			int arrayCapacity = array.length;	// ���� ���� ũ�� 
				
			// ������ ���� �� ���
			if(size == arrayCapacity) {
				int newSize = arrayCapacity * 2;
				
				// �迭 ����
				array = Arrays.copyOf(array, newSize);
				return;
			}
				
			// ������ ���� �̸����� ��Ұ� �����ϰ� ���� ���
			if(size < (arrayCapacity / 2)) {
					
				int newCapacity = (arrayCapacity / 2);
					
				// �迭 ����
				array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));
				return;
			}
		}
		
		public static void main(String[] args) {
			MyStack<String> myStack = new MyStack<String>();
			myStack.push("1");
			myStack.push("2");
			myStack.push("3");
			myStack.push("4");
			myStack.push("5");
			myStack.push("6");
			myStack.push("7");
			myStack.push("8");
			myStack.push("9");
			myStack.push("10");
			myStack.push("11");
			myStack.push("12");
			System.out.println(myStack);
		}
}
