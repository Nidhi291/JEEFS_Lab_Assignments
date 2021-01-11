import java.util.Arrays;
class Exercise8
{
 static boolean isPositive(String str)
 {
  int len;
  len = str.length();
  char ch[] = new char[len];
  
  for(int i=0; i<len; i++)
  {
   ch[i] = str.charAt(i);
  }
  
  Arrays.sort(ch);
  
  for(int i=0; i<len; i++)
  {
   if(ch[i] != str.charAt(i))
   {
    return false;
   }
  } 
  return true;
 }
 public static void main(String args[])
 {
  String str = "abcd";
  if(isPositive(str))
  {
   System.out.println(str+" is positive string");
  }
  else
  {
   System.out.println(str+" is not a positive string");
  }
 }
}