
package com.jarroyo.price.checker.component;

import org.springframework.stereotype.Component;

import com.jarroyo.price.checker.entity.Price;
import com.jarroyo.price.checker.model.PriceModel;

@Component("priceConverter")
public class PriceConverter {
	
	public Price convertPriceModel2Price(PriceModel priceModel) {
		
		Price price = new Price();
		price.setIdPrice(priceModel.getIdPrice());
		price.setIdBrand(price.getIdBrand());
		price.setIdProducto(priceModel.getIdProducto());
		price.setPriority(priceModel.getPriority());
		price.setCurr(priceModel.getCurr());
		price.setPrice(priceModel.getPrice());
		return price;
		
	}
	
	public PriceModel convertPrice2PriceModel(Price price) {
		
		PriceModel priceModel = new PriceModel();
		priceModel.setIdPrice(price.getIdPrice());
		priceModel.setIdBrand(price.getIdBrand());
		priceModel.setIdProducto(price.getIdProducto());
		priceModel.setPriority(price.getPriority());
		priceModel.setCurr(price.getCurr());
		priceModel.setPrice(price.getPrice());
//		priceModel.setStartDay(price.getStartDay());
//		priceModel.setEndDay(price.getEndDay());
		return priceModel;
	}

}
