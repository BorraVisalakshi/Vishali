package org.capg.app;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();
		System.out.println("Enter Booktype");
		String bookType =scan.next();
		
		
		KidUser kid = new KidUser();
		kid.registeraccount(age);
		kid.requestBook(bookType);
		
		AdultUsers adult = new AdultUsers();
		adult.registeraccount(age);
		adult.requestBook(bookType);
	}
}
