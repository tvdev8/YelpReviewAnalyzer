package com.yelp.review.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewWrapper {

	@JsonProperty(value = "reviews")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private Reviews[] reviews;
	@JsonProperty(value = "total")
	private Integer total;
	@JsonProperty(value = "possible_language")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private String[] languages;

	public Reviews[] getReviews() {
		return reviews;
	}

	public void setReviews(Reviews[] reviews) {
		this.reviews = reviews;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

}
