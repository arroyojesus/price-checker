package com.jarroyo.price.checker.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarroyo.price.checker.entity.Price;
import com.jarroyo.price.checker.model.Consult;
import com.jarroyo.price.checker.model.PriceModel;
import com.jarroyo.price.checker.service.PriceService;


@RestController
@RequestMapping("/consulta")
public class ConsultRestController {
	
	@Autowired
	@Qualifier("priceServiceImpl")
	private PriceService priceService;
	
	private static final Log LOGGER = LogFactory.getLog(ConsultRestController.class);
	
	@GetMapping("/{id}")
	public PriceModel getConsult(@PathVariable(value = "id") Long idPrice){
		LOGGER.info("Consultando precio para el id: " + idPrice);
		return priceService.getPrice(idPrice);
	}
	
	@GetMapping("/precio")
	public Price getConsult(@RequestBody Consult consult) throws ParseException{
		LOGGER.info("Consultando precio para el Producto y Cadena : " + consult.getProductId() +  "-" + consult.getBrandId());
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime dateTime = LocalDateTime.parse(consult.getApplicationDate(), formateador);
		
		return priceService.getPricePVP(consult.getProductId(), consult.getBrandId(), dateTime);
	}
	
	
}
