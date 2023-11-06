
public class Shop {
	private String shopName;
	private String telNo;
	
	
//コンストラクタ
	public Shop(String shopName, String telNo) {
		this.shopName = shopName;
		this.telNo = telNo;
	}
	public Shop() {
		
	}
	
	public void printShop() {
		System.out.println("(shop)"+ this.shopName + "です。　TEL:"+this.telNo);
	}
}
