package S1;

public class CD extends Goods {
	
	private String category;
	//商品情報登録
	public CD(String id, String goodsName, int price, String category) {
		super(id, goodsName, price);
		this.category = category;
	}
	//商品情報表示
	@Override
	public void printGoods() {
		System.out.println(" (CD)   " + this.goodsName + "   価格＞"+ super.price + "   カテゴリ＞" + this.category);

	}

}
