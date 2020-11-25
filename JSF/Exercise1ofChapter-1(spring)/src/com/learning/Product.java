package com.learning;

public class Product {
	
	private String productId;
    private String productCost;
    private String productName;
    private String productQuantity;
    
    public Product() {
    	
    }

	public String getproductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCost() {
		return productCost;
	}

	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantityy() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCost=" + productCost + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + "]";
	}
}
