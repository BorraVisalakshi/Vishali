package org.capg.training;

import java.util.Scanner;

public class ScoreOfSubjects
{
	 double subjectA;
	 double subjectB;
	 double subjectC;
	 double total;
	static Scanner scan = new Scanner(System.in);
	
	public ScoreOfSubjects()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreOfSubjects(double subjectA, double subjectB, double subjectC)
	{
		super();
		this.subjectA = subjectA;
		this.subjectB = subjectB;
		this.subjectC = subjectC;
		
	}

	public  void student1()
	{
		System.out.println("Enter marks in SubjectA for student 1");
		double subjectA= scan.nextDouble();
		System.out.println("Enter marks in SubjectB  for student 1");
		double subjectB = scan.nextDouble();
		System.out.println("Enter marks in SubjectC  for student 1");
		double subjectC= scan.nextDouble();
		
		double total = subjectA + subjectB + subjectC;
		double average= total/3;
		System.out.println("Total of all Subjects for Student1 :  "+total);
		System.out.println("Average of all Subjects for Student1 : "+average);
		
	}
	public  void student2()
	{
		System.out.println("Enter marks in SubjectA  for student 2");
		double subjectA= scan.nextDouble();
		System.out.println("Enter marks in SubjectB for student 2");
		double subjectB = scan.nextDouble();
		System.out.println("Enter marks in SubjectC for student 2");
		double subjectC= scan.nextDouble();
		
		double total = subjectA + subjectB + subjectC;
		double average= total/3;
		System.out.println("Total of all Subjects for Student2 :  "+total);
		System.out.println("Average of all Subjects for Student2 : "+average);
		
	}
	public  void student3()
	{
		System.out.println("Enter marks in SubjectA for student 3");
		double subjectA= scan.nextDouble();
		System.out.println("Enter marks in SubjectB for student 3");
		double subjectB = scan.nextDouble();
		System.out.println("Enter marks in SubjectC for student 3");
		double subjectC= scan.nextDouble();
		
		double total = subjectA + subjectB + subjectC;
		double average= total/3;
		System.out.println("Total of all Subjects for Student3 :  "+total);
		System.out.println("Average of all Subjects for Student3 : "+average);
		
	}
	
	public static void main(String[] args)
	{
		
		ScoreOfSubjects std1 = new ScoreOfSubjects();
		ScoreOfSubjects std2= new ScoreOfSubjects();
		ScoreOfSubjects std3= new ScoreOfSubjects();
		std1.student1();
		std2.student2();
		std3.student3();
	}

	
}
