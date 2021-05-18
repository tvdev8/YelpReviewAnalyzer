package com.yelp.review.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reviews {
	
	@JsonProperty(value="id")
	private String id;
	@JsonProperty(value="url")
	private String url;
	@JsonProperty(value="text")
	private String text;
	@JsonProperty(value="rating")
	private Integer rating;
	@JsonProperty(value="time_created")
	private String time_created;
	@JsonProperty(value="user")
	private User user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getTime_created() {
		return time_created;
	}

	public void setTime_created(String time_created) {
		this.time_created = time_created;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", url=" + url + ", text=" + text + ", rating=" + rating + ", time_created="
				+ time_created + ", user=" + user + "]";
	}
	
	

}
