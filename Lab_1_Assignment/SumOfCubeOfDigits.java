import java.util.*;
class SumOfCubeOfDigits
{
  public static void main(String args[])
  {
   int num2, sum=0, rem, cube;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number");
   int num1 = sc.nextInt();
   num2 = num1;
   
   while(num1 != 0)
   {
    rem = num1 % 10;
    cube = rem * rem * rem;
    sum = sum + cube;
    num1 = num1 / 10;
   }
   System.out.println("Sum of cube of digits is : "+ sum);
 }
}