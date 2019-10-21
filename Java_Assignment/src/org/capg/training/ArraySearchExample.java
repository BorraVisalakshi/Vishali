package org.capg.training;

import java.util.Scanner;

public class ArraySearchExample
{
	public static void binarySearch(int arr[], int first, int last, int key)
	{  
		   int mid = (first + last)/2;  
		   while( first <= last )
		   {  
		      if ( arr[mid] < key )
		      {  
		        first = mid + 1;     
		      }
		      else if ( arr[mid] == key )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else
		      {  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String args[])
		 {  
		        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		        
		        System.out.println("Enter Element to search");
		        Scanner scan = new Scanner(System.in);
		        int key = scan.nextInt(); 
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,key);     
		 }  
}
