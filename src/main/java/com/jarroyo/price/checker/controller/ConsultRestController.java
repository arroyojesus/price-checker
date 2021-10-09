package com.jarroyo.price.checker.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarroyo.price.checker.component.Response;
import com.jarroyo.price.checker.entity.PriceEntity;
import com.jarroyo.price.checker.exception.InvalidDataException;

import com.jarroyo.price.checker.service.PriceService;


@RestController
@RequestMapping("/consult")
public class ConsultRestController {
	
	@Autowired
	@Qualifier("priceServiceImpl")
	private PriceService priceService;
	
	private static final Log LOGGER = LogFactory.getLog(ConsultRestController.class);
	
	
	@GetMapping("/price")
	public Response getConsult(@Valid @RequestBody PriceEntity consult, BindingResult result){
		if(result.hasErrors()) {
			  throw new InvalidDataException(result);
		}
		LOGGER.info("Consultando precio para el Producto y Cadena : " + consult.getProductId() +  " - " + consult.getBrandId());
		return priceService.getPricePVP(consult);
	}
}
