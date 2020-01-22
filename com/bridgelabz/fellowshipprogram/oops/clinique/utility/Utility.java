package com.bridgelabz.fellowshipprogram.oops.clinique.utility;

import java.util.Scanner;

public class Utility {
	static Scanner scanner=new Scanner(System.in);
	
	// This method read integer value
	public int integerValue() {
		int value=0;
		try {
			value= scanner.nextInt();
		}
		catch(Exception e) {
			System.out.println("enter integer value");
			scanner.nextInt();
		}
		return value;
	}
	
	// This method read String value
	public static String stringValue() {
		try {
			return scanner.next();
		}catch(Exception e){
			System.out.println("Please enter valide option\\n");
		}
		return null;
		
	}
	
	// This method read long value
	public static long longValue() {
		try {
			return scanner.nextLong();
		}catch(Exception e) {
			System.out.println("Please enter valide option\n");
		}
		return 9;
	}
	
	// This method validate contact number value
	public static boolean phoneNumberValidation(String contact) {
		String value="^\\d{10}";
		if(contact.matches(value))
			return true;
		else
			return false;
	}
	
	// This method validate date value
	public static boolean dateValidation(String date) {
		String value="((([0]{1}[1-9]{1})|([1]{1}[0-9]{1})|([2]{1}[0-9]{1})|([3]{1}[0-1]{1}))/(([0]{1}[1-9]{1})|([1]{1}[0-2]{1}))/([1-9]{1}[0-9]{1}[0-9]{1}[1-9]{1}))";
		if(date.matches(value)) 
			return true;
		else
			return false;
		
	}
	scanner.close();
}
