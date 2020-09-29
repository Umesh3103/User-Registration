package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern Password = Pattern.compile("[a-z A-Z 0-9]{8,}");
    private static boolean checkName(String name) {
        return Password.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag =checkName("6648124abAc");
		if(flag){
			System.out.println("Valid password");
		}
		else{
			System.out.println("Invalid password");
		}
	}
	
}
