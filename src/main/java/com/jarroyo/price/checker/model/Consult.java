package com.jarroyo.price.checker.model;

public class Consult {
	
	private String productId;
	private Long brandId;
	private String applicationDate;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	@Override
	public String toString() {
		return "Consult [productId=" + productId + ", brandId=" + brandId + ", applicationDate=" + applicationDate
				+ "]";
	}
	
}
