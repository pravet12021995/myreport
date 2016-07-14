package com.flp.ems.view;
import java.util.scanner;

public class BootClass {
	public static void main (String[] args)
	{
		System.out.println("1.add Employee\n 2.Modify Employee\n 3.Remove Employee\n 4.Search Employee\n 5.getAll Employee");
		System.out.println("Enter menu");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		
		UserInteraction u = new UserInteraction();
		menuSelection(a,u);
	}
	public static void menuSelection(int a,UserInteraction u)
	{
		switch(a)
		{

		case 1:
			u.add Employee();
			break;
		case 2:
			u.Modify Employee();
			break;
		case 3:
			u.Remove Employee();
			break;
		case 4:
			u.Search Employee();
			break;
		case 5:
			u.getAll Employee();
			break;
		default:
			System.out.println("enter valid number");
			break;
		}
	}

}
