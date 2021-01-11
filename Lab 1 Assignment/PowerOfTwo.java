import java.util.*;
class PowerOfTwo
{
    static boolean isPowerOfTwo(int number)
    {
        if(number == 0) 
		{ 
		  return false; 
		}
        while(number != 1)
        {
            number = number/2;
            if(number%2 != 0 && number != 1)
			{ 
			  return false; 
			}
        }
        return true;
    } 
   
   public static void main(String []args) 
   { 
    Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	int number = sc.nextInt();
    boolean k = isPowerOfTwo(number); 
	
	if(k == true)
	{
		System.out.println(number + " is a power of 2 ");
	}
	else 
	{
		System.out.println(number + " is not a power of 2 ");
	}
   } 
}   