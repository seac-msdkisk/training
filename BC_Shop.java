package S1;

import java.util.Iterator;

public class BC_Shop extends Shop {
	
	private String url;
	
	public BC_Shop(String shopName, String telNo, String url) {
		super(shopName, telNo);
		this.url = url;
	}
	//店の情報を表示した後にリストの中身（商品情報）を順に表示

	@Override
	public void printShop() {
		System.out.println("(Shop) "+ super.shopName + "です。　TEL:" + super.telNo + "   URL:" + this.url);
		Iterator<Goods> it = super.list.iterator();
		while(it.hasNext()) {
			Goods goods = it.next();
			goods.printGoods();
		}
	}
	/*idでbookかcdかそれ以外かどうか確認しあっていたらインスタンス化することで、
	 * それぞれのクラスのコンストラクタを動かし情報を登録する。
	 * そしてリストに追加する。
	 */
	@Override
	public void addGoods(String id, String goodsName, int price, String param) {
		if(id.equals("book")) {
			goods = new Book(id, goodsName, price, param);
		} else if (id.equals("cd")) {
			goods = new CD(id, goodsName, price, param);
		} else {
			System.out.println("該当するIDがありません");
		}
		super.list.add(goods);
	}

}
