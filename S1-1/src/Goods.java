public class Goods {
	
	private String goodsName;
	private int price;
	
	public Goods(String goodsName, int price) {
		this.goodsName = goodsName;
		this.price = price;
	}
	
	public Goods() {}
	
	public void printGoods() {
		try{
			if(goodsName != null) {
				System.out.println("(Goods)"+ goodsName + price + "円");
			} else {
				System.out.println("(shoppingBag)商品は入っていません。");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
