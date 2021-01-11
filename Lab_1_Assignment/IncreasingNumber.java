import java.util.*;
class IncreasingNumber
{
  public static void main(String args[])
  {
	boolean flag = true;
	int lastdigit;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int number = sc.nextInt();
	
	lastdigit = number % 10;
	number = number / 10;
	
	while(number > 0)
	{
	  if(lastdigit < number % 10)
	  {
	    flag = false;
		break;
	  }
	  
	  lastdigit = number % 10;
	  number = number /10;
	}
	if(flag)
	{
	  System.out.println("Increasing order ");
	}
	else
	{
	  System.out.println("Not in increasing order ");
	}
  }
}