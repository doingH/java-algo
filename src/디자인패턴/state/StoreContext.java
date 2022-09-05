package 디자인패턴.state;

public class StoreContext {
	
	private State state;
	 
	public StoreContext(State state) {
		this.state = state;
	}
	 
	public void completedSales() {
		this.state = state.stockOut();
		this.state.printCurrentSale();
	}
	 
	public void onSales() {
		this.state = state.stockUp();
		this.state.printCurrentSale();
	}
	
	public void printCurrentSale() {
		this.state.printCurrentSale();
	}
	
	
	
}
