import java.util.*;
class PrimeNumber
{
  public static void main(String args[])
  {
   int i, j, count;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number");
   int number = sc.nextInt();
   
   System.out.println("Prime numbers up to " + number + " are: ");
   for(i=1; i<=number; i++)
   {
    count = 0;
    for(j=2; j<=i/2 ; j++)
    {
	  if(i%j == 0)
      {
	    count++;
		break;
	  }	  
	}
    if(count == 0 && i != 1)
	{
	  System.out.println(" "+ i);
	}
   }
  }
}  
   
   