package ������;

public class ����Լ�_���������� {
	public static void DFS(int n) {
		if(n==0) return;
		else {
			//���� ������ ������ ����� ���ظ��� �۵��Ѵ�.
			System.out.println(n);
			DFS(n-1);
			// DFS�� ���ϵǴ� ���� ���� ���� 9���� �ٽ� ���۵ȴ�.
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		DFS(3);
	}
	
}
