import java.util.*;
class SumOfNaturalNumber
{ 
  static void calculateSum(int n) 
  {      
    int sum = 0;
    for (int i=0; i<n; i++) 
    {        
      if (i%3 == 0 && i%5 == 0) 
	  {
		sum = sum + i;
	  }
    }
    System.out.println("Sum of first N natural number is: " + sum); 	
  } 
     
  public static void main(String []args) 
  { 
    Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	int n = sc.nextInt();
    calculateSum(n); 
  } 
} 