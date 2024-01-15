package S1;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingBag {
	private int money;
	private Goods goods;
	private ArrayList<Goods> buyGoodsList = new ArrayList<Goods>();

	
	//所持金を登録
	public ShoppingBag (int money) {
		this.money = money;
	}
	//現在の所持金を表示、買い物かごの中身が空か調べ入っていたらbuyGoodsListの中身を順に表示
	public void printShoppingBag() {
		System.out.println(" (ShoppingBag) 限度額　" + this.money + "円");
		if(buyGoodsList.isEmpty()) {
			System.out.println(" (shoppingBag) 商品なし");
		} else {
			Iterator<Goods> it = buyGoodsList.iterator();
			while(it.hasNext()){
				Goods goods = it.next();
				goods.printGoods();
			}
		}
	}
	public void setGoods(Goods goods) {
		buyGoodsList.add(goods);
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Goods getGoods() {
		return goods;
	}
	/*public void setGoods(Goods goods) {
		this.goods = goods;
	}*/
	
}
