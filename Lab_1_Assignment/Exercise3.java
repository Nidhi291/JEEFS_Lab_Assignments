import java.util.*;
class Fibo
{
	int nonRecFibo(int number)
	{
		int a = 0, b = 1, c=0;
		if(number == 1)
		return 0;
		else if(number == 2)
		return 1;
		else
		{
			for(int i = 2; i < number; i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	int recFibo(int number)
	{
		if(number == 1)
		return 0;
		else if(number == 2)
		return 1;
		else
		{
			return recFibo(number-1)+recFibo(number-2);
		}
	}
}
class Exercise3
{
	public static void main(String[] args)
	{
		Fibo fs = new Fibo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number: ");
		int number = sc.nextInt();
		System.out.println("Element using non recursive method is: "+fs.nonRecFibo(number));
		System.out.println("Element using recursive method is: "+fs.recFibo(number));
	}
}