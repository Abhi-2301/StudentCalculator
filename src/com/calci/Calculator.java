 package com.calci;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter number of subjects: ");
		int nS=sc.nextInt();
		int total=0;
		for(int i=0; i<nS; i++)
		{
			System.out.println("Enter Marks Obtained in Subject "+i+": ");
			int marks=sc.nextInt();
			total+=marks;
			
		}
		double avgP=(double)total/nS;
		char Grade;
		if(avgP>=90)
		{
			Grade='O';
		}
		else if(avgP>=80)
		{
			Grade='A';
		}
		else if(avgP>=70)
		{
			Grade='B';
		}
		else if(avgP>=60)
		{
			Grade='C';
		}
		else if(avgP>=50)
		{
			Grade='D';
		}
		else if(avgP>=35)
		{
			Grade='E';
		}
		else 
		{
			Grade='F';
		}
		System.out.println("Total Marks scored is: "+total);
		System.out.println("Average Percentage is: "+avgP);
		System.out.println("Grade: "+Grade);
	}

	}

