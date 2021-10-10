package com.jarroyo.price.checker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceConsultTestIT {

	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;
	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testPriceConsultPVP() throws Exception {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/consult/prices/35455/1/2020-06-14 10:00:00"), HttpMethod.GET, entity,
				String.class);

		String expected = "{\"status\":\"OK\",\"code\":\"200\",\"message\":\"Data obtained\",\"data\":{\"productId\":\"35455\",\"brandId\":1,\"priceId\":1,\"applicationDate\":\"2020-06-14T10:00:00\",\"price\":35.5,\"curr\":\"EUR\"}}";
		
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	@Test
	public void testPriceConsultPVP1() throws Exception {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/consult/prices/35455/1/2020-06-14 16:00:00"), HttpMethod.GET, entity,
				String.class);
	
		String expected= "{\"status\":\"OK\",\"code\":\"200\",\"message\":\"Data obtained\",\"data\":{\"productId\":\"35455\",\"brandId\":1,\"priceId\":2,\"applicationDate\":\"2020-06-14T16:00:00\",\"price\":25.45,\"curr\":\"EUR\"}}";

		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	@Test
	public void testPriceConsultPVP2() throws Exception {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/consult/prices/35455/1/2020-06-14 21:00:00"), HttpMethod.GET, entity,
				String.class);

		String expected = "{\"status\":\"OK\",\"code\":\"200\",\"message\":\"Data obtained\",\"data\":{\"productId\":\"35455\",\"brandId\":1,\"priceId\":2,\"applicationDate\":\"2020-06-14T21:00:00\",\"price\":25.45,\"curr\":\"EUR\"}}";
		
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	@Test
	public void testPriceConsultPVP3() throws Exception {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/consult/prices/35455/1/2020-06-15 10:00:00"), HttpMethod.GET, entity,
				String.class);

		String expected = "{\"status\":\"OK\",\"code\":\"200\",\"message\":\"Data obtained\",\"data\":{\"productId\":\"35455\",\"brandId\":1,\"priceId\":2,\"applicationDate\":\"2020-06-15T10:00:00\",\"price\":25.45,\"curr\":\"EUR\"}}";
		
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	@Test
	public void testPriceConsultPVP4() throws Exception {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/consult/prices/35455/1/2020-06-16 21:00:00"), HttpMethod.GET, entity,
				String.class);

		String expected = "{\"status\":\"OK\",\"code\":\"200\",\"message\":\"Data obtained\",\"data\":{\"productId\":\"35455\",\"brandId\":1,\"priceId\":4,\"applicationDate\":\"2020-06-16T21:00:00\",\"price\":38.95,\"curr\":\"EUR\"}}";
		
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	private String createURLWithPort(final String uri) {
		return "http://localhost:" + port + uri;
	}

}
