package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern NAME_PATTERN = Pattern.compile("[A-Z]{1}[a-z]{2,}");
    private static boolean checkName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag =checkName("Sharma");
		if(flag){
			System.out.println("Valid Last name");
		}
		else{
			System.out.println("Invalid Last name");
		}
	}
	
}
