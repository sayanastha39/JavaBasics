package inclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedExceptionDemo2 {
	
	public static void parseDatetoString(Date d) {
	
		//SimpleDateFormat allows you to define your pattern
		SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yyyy");
		String formattedDate = sdf.format(d); //cuz it's return type is string
		System.out.println("Date to string of out choice" + formattedDate);
	}
	
	public static void parseStringtoDate(String s) {
		System.out.println(s);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date d = sdf.parse(s);
			System.out.println("String to Date of out choice "+d);
		}
		//compile time so need to handle the exception
		catch(ParseException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		//to get current date in this format Tue Jul 21 13:10:42 CDT 2020
		Date d  = new Date(); //Tue Jul 21 13:10:42 CDT 2020 is default date format
		System.out.println("Default date object" + d);
		
		parseDatetoString(d); //13:46 PM 07/21/2020 for SimpleDateFormat
		
		String s = "2011-03-28";
		parseStringtoDate(s);
		
	}

}
