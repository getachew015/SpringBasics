package com.autowiring;

public class Product {
	
	private ProductDetail productDetail;
	private String prodId;
	private double quantity;
	
	public Product(){
		
	}

	public Product(String prodId, ProductDetail productDetail, double quantity) {
		super();
		this.prodId = prodId;
		this.productDetail = productDetail;
		this.quantity = quantity;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
}
