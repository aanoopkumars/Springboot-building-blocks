package com.ucan.restservices;

public class UserDetails {
	
	public UserDetails(String fullname, String lastname, String city) {
		this.fullname = fullname;
		this.lastname = lastname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserDetails [fullname=" + fullname + ", lastname=" + lastname + ", city=" + city + "]";
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String fullname;
	private String lastname;
	private String city;
	
}
