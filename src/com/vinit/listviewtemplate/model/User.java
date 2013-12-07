package com.vinit.listviewtemplate.model;

import java.util.ArrayList;


public class User {
	
	private String first_name;
	private String last_name;
	private String email_address;
	private String password; 
	private String phone_number;
	private String city;
	ArrayList<Event> eventsAttended;
//	private String zipcode;
//	private String image;
	
	public User(String fName, String lName, String eAddress,
			String pword, String phnNum, String city) {
		super();
		this.first_name = fName;
		this.last_name = lName;
		this.email_address = eAddress;
		this.password = pword;
		this.phone_number = phnNum;
		this.city = city;
		eventsAttended = new ArrayList<Event>();
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	public String getLastName() {
		return this.last_name;
	}
	public String getEmailAddress() {
		return this.email_address;
	}
	public String getPhoneNumber() {
		return this.phone_number;
	}
	
	public String getCity() {
		return this.city;
	}
	
	
	
	public void setFirstName(String fName) {
		this.first_name = fName;
	}
	public void setLastName(String lName) {
		this.last_name = lName;
	}
	public void setEmailAddress(String eAdd) {
		this.email_address = eAdd;
	}
	public void setPhoneNumber(String phnNbr) {
		this.phone_number = phnNbr;
	}
	public void setPassword(String pswd) {
		this.password = pswd;
	}
	
	public static ArrayList<User> getSampleUsers(){
        ArrayList<User> User = new ArrayList<User>();
        User t1 = new User("Rachit", "Patwa", "vinitpatwa@gmail.com", "12345678", "214-240-3387", "San Francisco" );
        User.add(t1);
        User t2 = new User("Sumit", "Patwa", "sumitpatwa@gmail.com", "12345678", "214-240-3387", "Pune" );
        User.add(t2);
        User t3 = new User("Amit", "Patwa", "amitpatwa@gmail.com", "12345678", "214-240-3387", "Pune" );
        User.add(t3);
        
        User t4 = new User("Arjun", "Pandiyan", "arjdj08@gmail.com", "12345678", "214-240-3387", "Dallas" );
        User.add(t4);
        User t5 = new User("Neha", "Jain", "neha.j0605@gmail.com", "12345678", "214-240-3387", "San Francisco" );
        User.add(t5);
        
        return User;
	}
	
	public void attendEvent(Event event){
		this.eventsAttended.add(event);
	}
}
