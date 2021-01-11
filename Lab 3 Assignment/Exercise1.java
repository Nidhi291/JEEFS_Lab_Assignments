import java.util.*;
class Exercise1
{
 public static void main(String args[])
 {
  int number, sum = 0;
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter integers with one space gap:");
  String str = sc.nextLine();
  
  StringTokenizer st = new StringTokenizer(str, " ");
  
  while(st.hasMoreTokens())
  {
	  String t = st.nextToken();
	  number = Integer.parseInt(t);
	  System.out.println(number);
	  sum = sum + number;
  }
  
  System.out.println("Sum of integers is: "+sum);
 }
}