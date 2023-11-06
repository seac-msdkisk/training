
public class Main {

	public static void main(String[] args) {
		Customer yamada = new Customer("山田");
		yamada.createBag(1000);
		Goods tokyoGoodsNone = new Goods();
		tokyoGoodsNone.printGoods();
		
		Shop tokyoShop = new Shop("東京店","03-1234-5678");
		//Shop osakaShop = new Shop("大阪店","06－2222-4444");
		Goods tokyoGoods = new Goods("海洋深層水",1200);
		//Goods osakaGoods = new Goods("ビタミンABC",350);
		yamada.printCustmor();
		tokyoShop.printShop();
		tokyoGoods.printGoods();
		//osakaShop.printShop();
		//osakaGoods.printGoods();
		

	}

}
