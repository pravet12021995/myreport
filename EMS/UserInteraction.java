package com.flp.ems.view;
import  java.util.Scanner;


public class UserInteraction {
	Scanner in=new Scanner(System.in);
	public void addEmployee()
	{
		System.out.println("enter the name");
		String name=in.next();
		System.out.println("enter the kin id");
		int kinid=in.nextInt();
		System.out.println("enter the email id");
		String emailid=in.next();
		System.out.println("enter the phone no");
		int phoneno=in.nextInt();
		System.out.println("enter the address");
		String address=in.next();
		System.out.println("enter the date of birth");
		String date_of_birth=in.next();
		System.out.println("enter the date of joining");
		String date_of_joining=in.next();
		System.out.println("enter the department");
		String Department=in.next();
	}

}
