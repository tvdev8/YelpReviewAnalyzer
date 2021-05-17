package com.yelp.review.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.yelp.review.ParamProperties;
import com.yelp.review.model.ReviewWrapper;
import com.yelp.review.model.Reviews;

@RestController
public class YelpController {

	@Autowired
	private RestTemplate restTemplate;

	@ResponseBody
	@GetMapping("/test")
	public List<Reviews> test(@RequestParam("bussId") String bussId) throws JsonParseException, IOException {

		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(ParamProperties.API_KEY);
		HttpEntity<String> hdrs = new HttpEntity<String>(headers);
		String reviewUrl = "https://api.yelp.com/v3/businesses/" + bussId + "/reviews";
		ResponseEntity<ReviewWrapper> rvwWrppr = restTemplate.exchange(reviewUrl, HttpMethod.GET, hdrs,
				ReviewWrapper.class);
		ReviewWrapper rvwWrpprBdy = rvwWrppr.getBody();

		List<Reviews> rvwList = Arrays.asList(rvwWrpprBdy.getReviews()).stream().toList();

		return rvwList;

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
