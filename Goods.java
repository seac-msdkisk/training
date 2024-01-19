package S1;
//抽象クラス
abstract class Goods {
	protected String id;
	protected String goodsName;
	protected int price;
	
	public Goods (String id, String goodsName ,int price) {
		this.goodsName = goodsName;
		this.price = price;
	}
	//goods情報を表示
	public abstract void printGoods() ;
		//System.out.println(" (Goods) " + this.goodsName + "  " + this.price + "円");
		
		
	
	public String getGoodsName() {
		return goodsName;
	}
	public int getPrice() {
		return price;
	}
	
}
	
