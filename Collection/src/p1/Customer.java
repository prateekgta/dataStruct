
package p1;

import java.util.Date;
import java.util.GregorianCalendar;




/*Details about Customer :
	(custId(int)--automatically generated (unique --prim key) ,email(string),dateOfBirth(Date),contactInfo -- has-a relationship: create it as the inner class(optional) --- countryCode,state,zipCode,phone
	Items -- String (which customer will purchase later)  */

public class Customer {
	private static int custId=0;
	private String email;
	private GregorianCalendar date;
	
	
	public Customer(String email,GregorianCalendar date) {
		super();
		this.email = email;
		this.date = date;
		custId++;
	}
	


	public GregorianCalendar getDate() {
		return date;
	}



	public String getEmail() {
		return email;
	}

	


	
}
	
	
	
	

	
	


