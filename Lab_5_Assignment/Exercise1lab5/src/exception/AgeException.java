package exception;

import java.util.Scanner;

public class AgeException extends Exception
{
 public AgeException(String s)
 {
	 System.out.println(s);
 }
}
class AgeExceptionDemo
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age:");
	int age = sc.nextInt();
	
		try 
		{
			if(age < 15)
			{
				throw new AgeException("Invalid age");
			}
			else
			{
				System.out.println("valid age");
			}
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
    }
}
