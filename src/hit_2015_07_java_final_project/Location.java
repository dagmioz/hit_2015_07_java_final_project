package hit_2015_07_java_final_project;
import java.io.*;
import java.net.*;
import javax.json.*;//external jar for using json methods

public class Location 
{
	private String city;
	private String country;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Geter's
	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
	//Seter's
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	public Location(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
}
