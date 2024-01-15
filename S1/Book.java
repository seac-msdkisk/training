package S1;

public class Book extends Goods {
	
	private String publisher;
	
	public Book(String id, String goodsName, int price ,String publisher) {
		super(id, goodsName, price);
		this.publisher = publisher;
	}

	@Override
	public void printGoods() {
		System.out.println(" (Book) " + super.goodsName + "   価格＞ " + super.price + "   出版社＞" + this.publisher);
		
	}

}
