package ����������.state;

public interface State {
	
	//����԰�
	State stockUp();
	
	//������
	State stockOut();
	
	void printCurrentSale();
	
}
