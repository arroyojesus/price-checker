package com.jarroyo.price.checker.service;

import com.jarroyo.price.checker.component.Response;
import com.jarroyo.price.checker.entity.PriceEntity;

public interface PriceService {
	
	public abstract Response getPricePVP(PriceEntity consult);

}
