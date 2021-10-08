package com.jarroyo.price.checker.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


 @Entity
 @Table(name = "PRICE")
public class Price implements Serializable{
	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 @Column(name="PRICE_LIST")
	 private Long idPrice;
	 
	 @Column(name="BRAND_ID")
	 private Integer idBrand;

	 @Column(name="PRODUCT_ID")
	 private String idProducto;
	 
	 @Column(name="PRIORITY")
	 private Integer priority;
	 
	 @Column(name="CURR")
	 private String curr;
	 
	 @Column(name="PRICE")
	 private Float price;

	public Long getIdPrice() {
		return idPrice;
	}
	@Column(name="START_DATE")
	private LocalDateTime  startDay;
	
	@Column(name="END_DATE")
	private LocalDateTime endDay;

	public void setIdPrice(Long idPrice) {
		this.idPrice = idPrice;
	}

	public Integer getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Integer idBrand) {
		this.idBrand = idBrand;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
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

	
	public Price(Long idPrice, Integer idBrand, String idProducto, Integer priority, String curr, Float price,
			LocalDateTime startDay, LocalDateTime endDay) {
		super();
		this.idPrice = idPrice;
		this.idBrand = idBrand;
		this.idProducto = idProducto;
		this.priority = priority;
		this.curr = curr;
		this.price = price;
		this.startDay = startDay;
		this.endDay = endDay;
	}

	public Price() {
	
	}
}
