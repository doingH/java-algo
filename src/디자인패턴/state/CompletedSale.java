package ����������.state;

public class CompletedSale implements State{

	@Override
	public State stockUp() {
		// TODO Auto-generated method stub
		return new OnSale();
	}

	@Override
	public State stockOut() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void printCurrentSale() {
		// TODO Auto-generated method stub
		System.out.println("�ǸſϷ�");
		
	}

}
