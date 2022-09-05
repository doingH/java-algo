package 디자인패턴.state;

public interface State {
	
	//재고입고
	State stockUp();
	
	//재고소진
	State stockOut();
	
	void printCurrentSale();
	
}
