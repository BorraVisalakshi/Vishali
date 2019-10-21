package org.capg.training;

import java.util.Scanner;

public class AmstrongNumber
{
public static void main(String[] args) 
{
	 int sum=0,rem,temp;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter the number");
	 int num=scanner.nextInt();
	    temp=num;  
	    while(num>0)  
	    {  
		    rem=num%10;  
		    num=num/10;  
		    sum=sum+(rem*rem*rem);  
	    }  
	    if(temp==sum)
	    {
	    System.out.println("armstrong number");
	    }
	    else 
	    {
	        System.out.println("Not armstrong number"); 
	    }
	    scanner.close();
}
}
