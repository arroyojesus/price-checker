package com.jarroyo.price.checker.service;

import java.time.LocalDateTime;
import java.util.Date;

import com.jarroyo.price.checker.entity.Price;
import com.jarroyo.price.checker.model.PriceModel;

public interface PriceService {
	
	public abstract PriceModel getPrice(Long idPrice);
	
	public abstract Price getPricePVP(String productId, Long brandId, LocalDateTime applicationDate);
}
