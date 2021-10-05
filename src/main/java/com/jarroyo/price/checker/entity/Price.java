package com.jarroyo.price.checker.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

 @Entity
 @Data
 @Builder
 @NoArgsConstructor
 @AllArgsConstructor
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
	 
	 @Column(name="START_DATE")
	 private Date  startDay;
	 
	 @Column(name="END_DATE")
	 private Date endDay;
	 
}
