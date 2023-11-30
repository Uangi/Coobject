package Abstract;


interface ProductService {
	void reduceProduct();
}
class Product implements ProductService{

	
	private static final int A = 1;
	private static final int B = 2;
	private static final int C = 3;
	private int stock = A + B + C;
	
	@Override
	public void reduceProduct() {
		if(stock > 0) {
			stock--;
			System.out.println("재고 감소! 현재 재고는 : " + stock);
		} else {
			System.out.println("재고가 없다..");
		}
	}
	
	public static int getA() {
		return A;
	}

	public static int getB() {
		return B;
	}

	public static int getC() {
		return C;
	}

	public int getStock() {
		return stock;
	}

	void setStock(int stock) {
		this.stock = A + B + C;
	}
}
