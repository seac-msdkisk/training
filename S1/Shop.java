package S1;

import java.util.ArrayList;
import java.util.Iterator;
//抽象クラス
public abstract class  Shop {
	
	protected ArrayList<Goods> list = new ArrayList<Goods>();//店の商品のリスト
	protected String shopName;
	protected String telNo;
	protected Goods goods;//集約(白いひし形)　会社と社員の関係　会社がなくなっても社員は別会社で働ける
				//コンポジション(黒いひし形)　クルマとエンジン　車が廃棄されるとエンジンも廃棄される
				//集約の方が結びつきが弱いということになる
	//コンストラクタ、店名と電話番号を受け取って設定する
	public Shop(String shopName, String telNo) {
		this.shopName = shopName;
		this.telNo = telNo;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public String getShopName() {
		return shopName;
	}
	public String getTelNo() {
		return telNo;
	}
	//店情報を表示
	public abstract void printShop() ;
		
		/*System.out.println("(Shop) "+ this.shopName + "です。　TEL:" + this.telNo);
		Iterator<Goods> it = list.iterator();
		while(it.hasNext()) {
			Goods goods = it.next();
			goods.printGoods();
		}

	}*/
	//商品を登録
	/*public void createGoods(String goodsName, int price) {
		goods = new Goods(goodsName, price);
	}*/
	//listから順に取り出して引数のgoodsNameと比較
	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
		Iterator<Goods> it = list.iterator();
		while(it.hasNext()) {
			Goods goods = it.next();
			String name = goods.getGoodsName();
			if(name.equals(goodsName)) {
				this.goods = goods;
				break;
			}
		}
//登録してあるgoodsと引数のgoodsNameが同じか比較
		String name = goods.getGoodsName();
		
		if(goodsName.equals(name)) {
			int money = shoppingBag.getMoney();
			int price = goods.getPrice();
//価格と所持金を比較し価格の方が低いならお釣りを計算、高いならお金が足りないと表示
			if(money >= price) {
				shoppingBag.setMoney(money - price);
				shoppingBag.setGoods(goods);
				System.out.println(" (Shop) " + this.shopName + " 「" + name + "は"
						+ price + "円です。まいどあり！おつりは" + (money - price) + "円です。」");
			
			} else {
				System.out.println(" (Shop) " + this.shopName + "「" + goodsName + "は" + price + "円です。お金が足りません。」");
			}
//goodsとgoodsNameが違う場合取り扱っていませんと表示
			
		} else {
			System.out.println(" (Shop) " + this.shopName + "「" + goodsName + "は取り扱っていません。」");
		}
		
	}
	public abstract void  addGoods(String id, String goodsName, int price, String param) ;
		/*
		//idによって本かCDを判別して振り分ける
		if(id.equals("book")) {
			goods = new Book(id, goodsName, price, param);
			//list.add(book);
		} else if (id.equals("cd")) {
			goods = new CD(id, goodsName, price, param);
			//list.add(cd);
		} else {
			System.out.println("該当するIDがありません");
		}
		list.add(goods);
		//Goods goods = new Goods(goodsName, price);
		//list.add(goods);
	}*/
}
