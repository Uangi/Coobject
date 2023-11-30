package Abstract;

import java.util.ArrayList;
import java.util.List;

interface OrderService {
	void createOrder();
}

public class Order implements OrderService{
	private List<ProductService> products = new ArrayList<>();

	@Override
	public void createOrder() {
		for(ProductService product : products) {
			product.reduceProduct();
		}
		System.out.println("주문이 생성됐습니다.");
		
	}
	
	public void addProduct(ProductService product) {
		products.add(product);	// 제품 리스트에 제품 추가
	}
}