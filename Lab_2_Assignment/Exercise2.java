import java.util.*;
import java.lang.String;
class Exercise2
{
	public static String sortStrings(String strArray[])
	{
		int len = strArray.length;
		String temp;
		String s1 = "";
        String s2 = "";
		String s3 = "";
		String s4 = "";
		String s5 = "";
		
		
		for(int i=0; i<len-1; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(strArray[i].compareTo(strArray[j]) > 0)
				{
					temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
		if(len%2 == 0)
		{
			for(int i=0; i<len/2; i++)
			{
				s1 = s1 + strArray[i].toUpperCase();
			}
	
			for(int j=(len/2); j<len; j++)
			{
				s2 = s2 + strArray[j].toLowerCase();
			}
			s3 = s3 + s1 + s2;
			System.out.println(""+s3);
		}
		else if(len%2 != 0)
		{
			for(int i=0; i<len; i++)
			{
				s4 = s4 + strArray[i].toUpperCase();
			}
			s5 = s5 + s4;
			System.out.println(""+s5);
		}
		
		return s3;
	}
	public static void main(String args[])
	{
        String strArray[] = {"r","s","t","u","v","w"};
		sortStrings(strArray);
	}
}