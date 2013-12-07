package com.vinit.listviewtemplate.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Event implements Serializable{

	public Event() {
		super();
	}
	public String getName() {
		return name;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public String getDate() {
		return date;
	}
	public String getCategories() {
		return categories;
	}
	public String getDescription() {
		return description;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getImage() {
		return image;
	}
	
	public String getTime() {
		return time;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public void setCategories(String categories) {
//		this.categories = categories;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public void setZipcode(String zipcode) {
//		this.zipcode = zipcode;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
//	
	public String name;
	public String creator;
	public String date;
	public String categories;
	public String description; 
	public String address;
	public String city;
	public String zipcode;
	public String image;
	public ArrayList<User> users;
	public String time;
	public int fbLikes;
	public int retweets;
	public String tweetImageUrl;
	public String videoUrl;
}
