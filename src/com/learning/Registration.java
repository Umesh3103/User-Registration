package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern Email = Pattern.compile("^[0-9 a-z A-Z]+([_+-.]{0,1}[0-9 a-z A-Z]+)[@][0-9 a-z A-Z]+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2}){0,1}$");
    private static boolean checkName(String name) {
        return Email.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag =checkName("abc.xyz@gmail.co.in");
		if(flag){
			System.out.println("Valid email");
		}
		else{
			System.out.println("Invalid email");
		}
	}
	
}
