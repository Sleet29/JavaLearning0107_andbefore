package ex07_01_object;

public class GoodsStock_make {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock();
		
		obj.goodsCode = "52135";
		obj.stockNum = 200;
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고수량:"+obj.stockNum);
		
		obj.addStock(1000);
		System.out.println("======obj.addStock(1000); 후======");
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고수량:"+obj.stockNum);

		obj.subtractStock(500);
		System.out.println("======obj.subtractStock(500); 후======");
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고수량:"+obj.stockNum);
		
	}
}
