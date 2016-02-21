package p1;

import java.util.Date;
//countryCode,state,zipCode,phone
//Items -- String (which customer will purchase later)
import java.util.GregorianCalendar;

public class Custinfo extends Customer {
	
	
	private int countrycode;
	private String state;
	private int zipCode;
	private String phone;
	
	
	
	public Custinfo(String email, GregorianCalendar date, int countrycode, String state,int zipCode, String phone) 
	
	{
		super(email, date);
		this.countrycode = countrycode;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone;
		
	}
	
	
	
	public String getEmail() {
		String st=super.getEmail();
		return st;
	}
	public GregorianCalendar getDate() {
		GregorianCalendar da=super.getDate();
		return da;
	}


}
