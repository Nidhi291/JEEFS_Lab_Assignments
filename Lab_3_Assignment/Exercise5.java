import java.util.*;
class Exercise5
{
 public static int countOfWords(String str, int len)
 {
  int wordCount=0;
  char chWords[] = new char[len];
  
  for(int i=0; i<len; i++)
  {
	chWords[i] = str.charAt(i);
  }
  
  for(int i=0; i<len; i++)
  {
	if(chWords[i] == ' ')
	{
		wordCount++;
	}
  }  
  return wordCount+1;
 }
 public static int countOfCharacters(String str, int len)
 {
  int characterCount=0;

  for(int i=0; i<len; i++)
  {
	if(str.charAt(i) != ' ')
	{
		characterCount++;
	}
  }
  return characterCount;
 } 
 /*
 public static int countOfLines(String str, int len)
 {
  int lineCount=0;

  for(int i=0; i<len; i++)
  {
	if(str.charAt(i) != '\n')
	{
		lineCount++;
	}
  }
  return lineCount+1;
 } 
 */
 public static void main(String args[])
 {
   String str = "my name is nidhi meena";
   int len;
   len = str.length();
   System.out.println(countOfWords(str,len));
   System.out.println(countOfCharacters(str,len));
   //System.out.println(countOfLines(str,len));
 }
}