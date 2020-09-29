package com.learning;
import java.util.regex.*;

public class Registration {
	private static final Pattern Email = Pattern.compile("^[0-9 a-z A-Z]+([_+-.]{0,1}[0-9 a-z A-Z]+[@][0-9 a-z A-Z]+[.][a-z A-Z]{2,4})([.][a-z A-Z]{2}){0,1}");
    private static boolean checkName(String name) {
        return Email.matcher(name).matches();
    }
    
    private static void checkEmail(boolean email){
    	if(email){
			System.out.println("Valid Email");
		}
		else{
			System.out.println("Invalid Email");
		}
    }
	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		boolean flag;
		String[] s=new String[20];
		s[0]="abc@yahoo.com";
		s[1]="abc-100@yahoo.com";
		s[2]="abc.100@yahoo.com";
		s[3]="abc111@abc.com";
		s[4]="abc-100@abc.net";
		s[5]="abc.100@abc.com.au";
		s[6]="abc@1.com";
		s[7]="abc+100@gmail.com";
		s[8]="abc";
		s[9]="abc@.com.my";
		s[10]="abc123@gmail.a";
		s[11]="abc123@.com";
		s[12]="abc123@.com.com";
		s[13]=".abc@abc.com";
		s[14]="abc()*@gmail.com";
		s[15]="abc..2002@gmail.com";
		s[16]="abc.@gmail.com";
		s[17]="abc@abc@gmail.com";
		s[18]="abc@gmail.com.1a";
		s[19]="abc@gmail.com.aa.au";
		
		
		
		for(int i=0;i<20;i++){
			System.out.println(s[i]);
			flag=checkName(s[i]);
			checkEmail(flag);
		}
		
	}
	
}
