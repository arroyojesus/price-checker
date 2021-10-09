
package com.jarroyo.price.checker.component;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.jarroyo.price.checker.entity.PriceEntity;
import com.jarroyo.price.checker.model.Price;

@Component("priceConverter")
public class PriceConverter {

	public Price convertPrice2PriceModel(PriceEntity priceEntity, LocalDateTime applicationDate) {
		
		Price price = new Price();
		price.setProductId(priceEntity.getProductId());
		price.setBrandId(priceEntity.getBrandId());
		price.setPriceId(priceEntity.getPriceId());
		price.setApplicationDate(applicationDate);
		price.setPrice(priceEntity.getPrice());
		price.setCurr(priceEntity.getCurr());
		return price;
	}
}
