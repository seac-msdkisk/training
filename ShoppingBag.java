package S1;

import java.util.ArrayList;

public class ShoppingBag implements UnloadGoods{
	private int money;
	private Goods goods;
	private ArrayList<Goods> buyGoodsList;

	
	//所持金を登録
	public ShoppingBag (int money) {
		this.money = money;
		buyGoodsList = new ArrayList<Goods>();
		
	}
	//現在の所持金を表示、買い物かごの中身が空か調べ入っていたらbuyGoodsListの中身を順に表示
	public void printShoppingBag() {
		System.out.println(" (ShoppingBag) 限度額　" + this.money + "円");
		if(buyGoodsList.isEmpty()) {
			System.out.println(" (shoppingBag) 商品なし");
		} else {
			/*
			Iterator<Goods> it = buyGoodsList.iterator();
			while(it.hasNext()){
				Goods goods = it.next();
			*/
			//拡張for文に書き換え
			for (Goods goods : buyGoodsList) {
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
	//購入品のリストの中身を全削除
	@Override
	public void clearGoods() {
		this.buyGoodsList.clear();
	}
	//購入品のリストの中身の指定された物を削除
	@Override
	public void removeGoods(String goodsName) {
		/*Iterator<Goods> it = buyGoodsList.iterator();
		while(it.hasNext()) {
			Goods goods = it.next();
		*/
		for (Goods goods : buyGoodsList) {
			String name = goods.getGoodsName();
		
			if (name.equals(goodsName)) {
				buyGoodsList.remove(goods);
				break;
			}
		}
	}
	
}
