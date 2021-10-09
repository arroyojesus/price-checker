package com.jarroyo.price.checker.service.impl;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jarroyo.price.checker.component.DateUtil;
import com.jarroyo.price.checker.component.HeaderResponse;
import com.jarroyo.price.checker.component.PriceConverter;
import com.jarroyo.price.checker.component.Response;
import com.jarroyo.price.checker.controller.ConsultRestController;
import com.jarroyo.price.checker.entity.PriceEntity;
import com.jarroyo.price.checker.repository.PriceRepository;
import com.jarroyo.price.checker.service.PriceService;

@Service("priceServiceImpl")
public class PriceServiceImpl implements PriceService {
	
	private static final Log LOGGER = LogFactory.getLog(ConsultRestController.class);
	
	@Autowired
	@Qualifier("priceRepository")
	private PriceRepository priceRepository;
	
	@Autowired
	@Qualifier("dateUtil")
	private DateUtil dateUtil;
	
	@Autowired
	@Qualifier("priceConverter")
	private PriceConverter priceConverter;
	
	@Override
	public Response getPricePVP(PriceEntity consult) {
		LOGGER.info("Consultando servicio getPricePVP");
		
		LocalDateTime applicationDate = dateUtil.converterStringToLocalDateTime(consult.getApplicationDate());
		
		PriceEntity price = priceRepository.findPrice(consult.getProductId(),consult.getBrandId(), applicationDate);
		if(price != null) {
			return new Response(HeaderResponse.STATUS_OK, priceConverter.convertPrice2PriceModel(price, applicationDate));
		}else {			
			throw new NoSuchElementException("No existe registros para la combinacion idProduct, idBrand, applicactionDate indicados");
		}
	}
}
