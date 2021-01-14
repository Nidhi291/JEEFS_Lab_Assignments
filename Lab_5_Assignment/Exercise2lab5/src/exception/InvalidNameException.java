package exception;

import java.util.Scanner;

public class InvalidNameException extends Exception
{
	public InvalidNameException(String s)
	{
		System.out.println(s);
	}
}
class NameExceptionDemo
{
	public static void main(String args[])
	{
		String firstname, lastname;
		System.out.println("Enter your first name");
		Scanner sc = new Scanner(System.in);
		firstname = sc.nextLine();
		System.out.println("Enter your last name");
		Scanner sc1 = new Scanner(System.in);
		lastname = sc1.nextLine();
		
		try
		{
			if(firstname.isEmpty() || lastname.isEmpty())
			{
				throw new InvalidNameException("Invalid Name");
			}
			else
			{
				System.out.println("Valid Name");
			}
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
	}
}