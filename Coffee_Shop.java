package S1;

import java.util.Iterator;

public class Coffee_Shop extends Shop {
	
	private String hours;
	private String holidays;
	
	public Coffee_Shop(String shopName, String telNo, String hours, String holidays) {
		super(shopName, telNo);
		this.holidays = holidays;
		this.hours = hours;
	}
	//店の情報を表示した後にリストの中身（商品情報）を順に表示
	@Override
	public void printShop() {
		System.out.println("(Coffee) "+ super.shopName + "です。　TEL:" + super.telNo + 
				"   営業時間：" + this.hours + "　定休日：" + this.holidays);
		Iterator<Goods> it = super.list.iterator();
		while(it.hasNext()) {
			Goods goods = it.next();
			goods.printGoods();
		}
	}
	/*idでbeanかどうか確認しあっていたらインスタンス化することで、
	 * Beanクラスのコンストラクタを動かし情報を登録する。
	 * そしてリストに追加する。
	 */
	
	@Override
	public void addGoods(String id, String goodsName, int price, String param) {
		if(id.equals("bean")) {
			goods = new Bean(id, goodsName, price, param);
		} else {
			System.out.println("該当するIDがありません");
		}
		super.list.add(goods);
		
	}

}
