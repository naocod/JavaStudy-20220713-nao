package j14_lombok.builder;

public class Builder extends ProductBuilder {

	@Override
	public ProductBuilder productCode(int productCode) {
		product.setProductCode(productCode);
		return this;
	}

	@Override
	public ProductBuilder productName(String productName) {
		product.setProductName(productName);
		return this;
	}

	@Override
	public ProductBuilder productCategory(String productCategory) {
		product.setProductCategory(productCategory);
		return this;
	}

	@Override
	public ProductBuilder createDate(String createDate) {
		product.setCreateDate(createDate);
		return this;
	}


}
