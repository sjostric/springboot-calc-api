package com.sjostric.boot.calc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * REST resources
 */
@RestController
public class CalcApiController {

	private static final Logger logger = LoggerFactory.getLogger(CalcApiController.class);

	@Value("${backend.url}")
	public String backendUrl;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("calc/add/{a}/{b}")
	public String products(@PathVariable Integer a, @PathVariable Integer b) {
		logger.info(String.format("Doing addition (using backend %s): %d + %d", backendUrl, a, b));
		ResponseEntity<Integer> result = restTemplate.getForEntity(String.format("%s/calc/add/%d/%d", backendUrl, a, b),
				Integer.class);
		return String.format("Result is %d", result.getBody());
	}

}
