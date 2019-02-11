package com.autowiring;

public class ProductDetail {
	
	private String prodId, prodName;
	private double price;
	
	public ProductDetail(){
		
	}

	public ProductDetail(String prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName= prodName;
		this.price = price;
	} 

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


}
