package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern Email = Pattern.compile("[0-9]{2}\\s[6-9]{1}[0-9]{9}");
    private static boolean checkName(String name) {
        return Email.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag =checkName("91 6648124789");
		if(flag){
			System.out.println("Valid number");
		}
		else{
			System.out.println("Invalid number");
		}
	}
	
}
