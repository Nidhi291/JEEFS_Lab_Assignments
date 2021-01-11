import java.util.*;
class TrafficLight
{
  public static void main(String args[])
  {
   System.out.println("Enter light: red, yellow, green");
   Scanner sc = new Scanner(System.in);
   String light = sc.nextLine();
   
   switch(light)
   {
     case "red":
	        System.out.println("stop");
			break;
	 case "yellow":
	        System.out.println("ready");
			break;
	 case "green":
	        System.out.println("go");
			break;
	 default:
	        System.out.println("Invalid choice");
   }
  }
}  