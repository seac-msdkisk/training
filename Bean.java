package S1;

public class Bean extends Goods {
	
	private String taste;
	
	public Bean(String id, String goodsName, int price, String taste) {
		super(id, goodsName, price);
		this.taste = taste;
	}
	//商品情報を表示する。
	@Override
	public void printGoods() {
		System.out.println(" (Bean)   " + this.goodsName + "   価格＞"+ super.price + "   味わい＞" + this.taste);

	}

}
