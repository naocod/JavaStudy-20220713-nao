package j14_lombok.builder2;

public class ProductMain {
	
	public static void main(String[] args) {
		Product product = Product.builder()
				.productCode(20220001)
				.productCategory("텀블러")
				.build();
		
		System.out.println(product);
		
	}

}
