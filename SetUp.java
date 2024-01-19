package S1;

public class SetUp {

	public static void main(String[] args) {
		//S3-3
		/*
		//店作成
		Shop shop = new BC_Shop("B&C", "03-1122-2244","http://www.b_c.co.jp");
		Shop coffeeShop = new Coffee_Shop("珈琲館", "06-6666-8888", "11:00～23:00","Sunday");
		//店に商品追加
		shop.addGoods("book", "これからのJava", 2300, "大日本技術社");
		shop.addGoods("book", "UML技術完成", 3500, "テックプラス");
		shop.addGoods("book", "ロジカルなあなた", 1200, "システムバンク");
		shop.addGoods("book", "すべてはオブジェクト", 5500, "EKL");
		shop.addGoods("cd", "B列車で行こう", 2820, "JAZZ");
		shop.addGoods("cd", "ロックオンロック", 1050, "ROCK");
		coffeeShop.addGoods("bean", "モカ", 750, "酸味・コク");
		coffeeShop.addGoods("bean", "キリマンジャロ", 900, "苦味・酸味");
		//顧客情報追加
		Customer yamada = new Customer("山田");
		//所持金を追加
		yamada.createBag(4000);
		System.out.println("=====================================================================");
		shop.printShop();//B&Cの店情報表示
		System.out.println("=====================================================================");
		coffeeShop.printShop();//珈琲館の店情報表示
		System.out.println("=====================================================================");
		
		yamada.printCustomer();//顧客情報表示
		System.out.println();
		//商品購入
		yamada.buyGoods(coffeeShop, "キリマンジャロ");
		System.out.println();
		yamada.buyGoods(shop, "ロジカルなあなた");
		System.out.println();
		yamada.buyGoods(coffeeShop, "コロンビア");
		System.out.println();
		yamada.buyGoods(shop, "B列車で行こう");
		System.out.println();
		yamada.buyGoods(shop, "ロックオンロック");
		System.out.println();
		yamada.buyGoods(shop, "これからのJava");
		System.out.println();
		//最終的な顧客情報と買い物かごの中身
		yamada.printCustomer();
		*/
		
		//S3-4
		Customer yamada = new Customer("山田");
		yamada.createBag(10000);
		yamada.printCustomer();
		System.out.println();
		
		Shop shop = new BC_Shop("B&C", "03-1122-2244","http://www.b_c.co.jp");
		Shop coffeeShop = new Coffee_Shop("珈琲館", "06-6666-8888", "11:00～23:00","Sunday");
		
		shop.addGoods("book", "これからのJava", 2300, "大日本技術社");
		shop.addGoods("book", "UML技術完成", 3500, "テックプラス");
		shop.addGoods("book", "ロジカルなあなた", 1200, "システムバンク");
		shop.addGoods("book", "すべてはオブジェクト", 5500, "EKL");
		shop.addGoods("cd", "B列車で行こう", 2820, "JAZZ");
		shop.addGoods("cd", "ロックオンロック", 1050, "ROCK");
		coffeeShop.addGoods("bean", "モカ", 750, "酸味・コク");
		coffeeShop.addGoods("bean", "キリマンジャロ", 900, "苦味・酸味");
		
		yamada.buyGoods(coffeeShop, "キリマンジャロ");
		System.out.println();
		
		yamada.buyGoods(shop, "ロジカルなあなた");
		System.out.println();
		
		yamada.buyGoods(coffeeShop, "コロンビア");
		System.out.println();
		
		yamada.buyGoods(shop, "ロックオンロック");
		System.out.println();
		
		yamada.buyGoods(shop, "これからのJava");
		System.out.println();
		
		yamada.buyGoods(coffeeShop, "キリマンジャロ");
		System.out.println();
		
		yamada.printCustomer();
		System.out.println();
		
		yamada.removeGoods("キリマンジャロ");
		yamada.printCustomer();
		System.out.println();
		
		yamada.clearGoods();
		yamada.printCustomer();
		
		
		

	}

}
