package com.jarroyo.price.checker.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

 @Entity
 @Table(name = "PRICE")
public class PriceEntity implements Serializable{
	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 @Column(name="PRICE_LIST")
	 private Long priceId;
	 
	 @Column(name="BRAND_ID")
	 @NotNull(message = "El brandId no puede ser nulo")
	 private Integer brandId;

	 @Column(name="PRODUCT_ID")
	 @NotNull(message = "El productId no puede ser nulo")
	 private String productId;
	 
	 @Column(name="PRIORITY")
	 private Integer priority;
	 
	 @Column(name="CURR")
	 private String curr;
	 
	 @Column(name="PRICE")
	 private Float price;

	public Long getIdPrice() {
		return priceId;
	}
	@Column(name="START_DATE")
	private LocalDateTime  startDay;
	
	@Column(name="END_DATE")
	private LocalDateTime endDay;

	@Transient
	private String applicationDate;

	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public LocalDateTime getStartDay() {
		return startDay;
	}

	public void setStartDay(LocalDateTime startDay) {
		this.startDay = startDay;
	}

	public LocalDateTime getEndDay() {
		return endDay;
	}

	public void setEndDay(LocalDateTime endDay) {
		this.endDay = endDay;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public PriceEntity() {
		super();
	}
}
