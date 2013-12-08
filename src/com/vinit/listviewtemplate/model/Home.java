package com.vinit.listviewtemplate.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Home implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Home(String image, String name, String date, String desciption) {
		this.image = image;
		this.name = name;
		this.date = date;
		this.description = desciption;
	}
	public String name;
	public String creator;
	public String date;
	public String description; 
	public String image;
	public String time;
	
}
