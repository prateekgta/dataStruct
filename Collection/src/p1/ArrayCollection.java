package p1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class ArrayCollection {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<p1.Customer> abc=new ArrayList<p1.Customer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Of Customer to Enter");
		int j=sc.nextInt();
		for(int i=0;i<j;i++)
		{
			System.out.print("Enter the mail id");
			String email=sc.next();
			try{validate(email);}
			catch(MyException a)
			{System.out.println(a);}
			System.out.println("BirthDate(yy,mm,dd)");
			GregorianCalendar gr=new GregorianCalendar(sc.nextInt(),sc.nextInt(),sc.nextInt());
			try{valid(gr);}
			catch(AgeException a)
			{System.out.println(a);}
			
			
			
		}
		System.out.print("Enter the email,BirthDate(yy,mm,dd),countrycode,state,zipCode,phone");
		Custinfo cf=new Custinfo(sc.next(),new GregorianCalendar(sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.nextInt(),sc.next(),sc.nextInt(),sc.next()); 
		try{
			String s=cf.getEmail();
			validate(s);	
			}
		catch(MyException a)
		{
			System.out.println(a);
		}	
		
/*		try{
			GregorianCalendar date=cf.getDate();
		//	valida(date);
		}catch(AgeException a)
		{
			System.out.println(a);
		}
		
	*/	abc.add(cf);
		
		
		
	}
	public static void validate(String s) throws MyException
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='@')
			{
				throw new MyException("Invalid Email Id ,missing @");
			}
		}
		
		
	}
	public static void valid(GregorianCalendar date) throws AgeException
	{
		GregorianCalendar D=new GregorianCalendar();
		int year=D.get(Calendar.YEAR);
		int year1=date.get(Calendar.YEAR);
		System.out.println(year+" and :"+year1);
		if((year-year1)<18)
		{
			throw new AgeException("");
		}
		
		
	}
}
