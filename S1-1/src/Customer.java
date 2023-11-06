
public class Customer {

	private String customerName;
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	
	public  void createBag(int money) {
		System.out.println("(Customer)"+ this.customerName + "さんの買い物かご");
		ShoppingBag bag = new ShoppingBag(money);
		bag.printShoppingBag();
		
	}
	public void printCustmor() {
		System.out.println("(Customer)" + this.customerName + "「この店は何店ですか？」");
		
	}	
		
}
