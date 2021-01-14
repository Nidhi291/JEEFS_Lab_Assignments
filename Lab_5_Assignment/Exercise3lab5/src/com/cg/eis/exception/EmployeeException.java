package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException extends Exception
{
	public EmployeeException(String s)
	{
		System.out.println(s);
	}
}
class EmployeeExceptionDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary:");
		int salary = sc.nextInt();
		
		try
		{
			if(salary < 3000)
			{
				throw new EmployeeException("Salary can't be less than 3000");
			}
			else
			{
				System.out.println("Valid salary");
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}
}