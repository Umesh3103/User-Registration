package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern Password = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])([a-z A-Z 0-9]).{6,}");
    private static boolean checkName(String name) {
        return Password.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag =checkName("ab1Aabca");
		if(flag){
			System.out.println("Valid password");
		}
		else{
			System.out.println("Invalid password");
		}
	}
	
}
