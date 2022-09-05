package 디자인패턴.state;

public class Store {
	public static void main(String[] args) {
		StoreContext storeContext = new StoreContext(new CompletedSale());
		storeContext.printCurrentSale();
		
		storeContext.onSales();
		storeContext.completedSales();
		
	}

}
