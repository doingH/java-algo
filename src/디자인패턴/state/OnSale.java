package ����������.state;

public class OnSale implements State {

	private State state;
	

	@Override
	public State stockUp() {
		return this;
	}

	@Override
	public State stockOut() {
		// TODO Auto-generated method stub
		return new CompletedSale();
	}

	@Override
	public void printCurrentSale() {
		
		System.out.println("�Ǹ����Դϴ�.");
		
	}
}
