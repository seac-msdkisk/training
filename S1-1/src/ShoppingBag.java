
public class ShoppingBag {
	
	private int money;
	
	public ShoppingBag(int money) {
		this.money = money;
	}
	
	public void printShoppingBag() {
		System.out.println("(shoppingBag) 限度額" + this.money + "円");
	}
}
