package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern Password = Pattern.compile("(?=.*[A-Z])([a-z A-Z 0-9]).{8,}");
    private static boolean checkName(String name) {
        return Password.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag =checkName("AA6648124ABabc");
		if(flag){
			System.out.println("Valid password");
		}
		else{
			System.out.println("Invalid password");
		}
	}
	
}
