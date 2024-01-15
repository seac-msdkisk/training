package S1;

public class Customer {
	private String customerName;
	private ShoppingBag shoppingBag; 
	//private Shop shop;
	//顧客情報登録
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	//買い物かご作成
	public void createBag(int money) {
		shoppingBag = new ShoppingBag(money);
	}
	//顧客情報とその買い物籠の中身を表示
	public void printCustomer() {
		System.out.println("(Customer) " + this.customerName + "さんの買い物かご");
		shoppingBag.printShoppingBag();
	}
	//店の情報を聞き出す
	public void queryShop(Shop shop) {
		System.out.println("(Customer) " + this.customerName + "「この店は何店ですか」");
		shop.printShop();
	}
	//商品を買う。引数で受け取った店に依頼する。
	public void buyGoods(Shop shop , String goodsName) {
		System.out.println("(Customer) " + this.customerName + "「" + goodsName + "をください。」");
		shop.saleGoods(goodsName, shoppingBag);
		
		
	}
	
}
