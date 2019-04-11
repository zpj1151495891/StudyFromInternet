package behaviorTypePatterns.CommandPattern;
/*
 * 命令模式
*/
public class MainApp {
	public static void main(String[] args) {
		Stock abcStock=new Stock();
		BuyStock buyStockOrder =new BuyStock(abcStock);
		SellStock sellStockOrder =new SellStock(abcStock);
		
		Broker broker=new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
	}

}
