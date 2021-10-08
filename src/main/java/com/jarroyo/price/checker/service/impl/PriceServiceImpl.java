package com.jarroyo.price.checker.service.impl;

import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jarroyo.price.checker.component.PriceConverter;
import com.jarroyo.price.checker.controller.ConsultRestController;
import com.jarroyo.price.checker.entity.Price;
import com.jarroyo.price.checker.model.PriceModel;
import com.jarroyo.price.checker.repository.PriceRepository;
import com.jarroyo.price.checker.service.PriceService;

@Service("priceServiceImpl")
public class PriceServiceImpl implements PriceService {
	
	private static final Log LOGGER = LogFactory.getLog(ConsultRestController.class);
	
	@Autowired
	@Qualifier("priceRepository")
	private PriceRepository priceRepository;

	@Autowired
	@Qualifier("priceConverter")
	private PriceConverter priceConverter;
	
	@Override
	public PriceModel getPrice(Long idPrice) {
		return priceConverter.convertPrice2PriceModel(priceRepository.getById(idPrice));
	}
	
	@Override
	public Price getPricePVP(String productId, Long brandId, LocalDateTime applicationDate) {
		LOGGER.info("Consultando servicio getPricePVP");
//		return priceConverter.convertPrice2PriceModel(priceRepository.findPrice(productId,brandId, applicationDate));
		return priceRepository.findPrice(productId,brandId, applicationDate);

	}
	
}
