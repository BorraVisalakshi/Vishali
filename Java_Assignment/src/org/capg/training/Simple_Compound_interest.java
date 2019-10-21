package org.capg.training;

import java.util.Scanner;

public class Simple_Compound_interest 
  {
	public static void main(String args[])
	{

		 double amount = 0, ci, si;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter principle");
		 double principle = scanner.nextDouble();
		 System.out.println("enter time in months");
		 double time = scanner.nextDouble();
		 System.out.println("enter rate");
		 double rate = scanner.nextDouble();
		 amount = principle* ((1 + rate / 100) * (1 + rate / 100) * (1 + rate / 100));
		 ci = amount - principle;
		 System.out.println("compound interest=" + ci);
		 si = (principle * time * rate) / 100;
		 System.out.println("simple interest=" + si);
		 scanner.close();
		}
	}


