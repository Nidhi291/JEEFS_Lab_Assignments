import java.util.*;
class Exercise4
{
	public static void modifyArray(int array[],int len)
	{
		//int len = array.length;
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; )
			{
				if(array[i] == array[j])
				{
					for(int k=j; k<len; k++)
					{
						array[k] = array[k+1];
					}
					len--;
				}
				else 
				{
					j++;
				}
			}
		}
		System.out.println("After removing duplicates");
		for(int i=0; i<len; i++)
		{
			System.out.println(""+array[i]);
		}	
		
		sortArray(array);
	}
	public static void sortArray(int array[])
	{
		for(int i=array.length-1; i>=0; i--)
		{
			int temp = 0;
			for(int j=i-1; j>=0; j--)
			{
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		System.out.println("Array in descending order:");
		for(int k=0; k<array.length; k++)
		{
			System.out.println(""+array[k]);
		}
	}
	public static void main(String args[]) throws Exception
	{
		int array[] = {1,5,1,4,5,2,6,5,2,7};
		Arrays.sort(array);
		int len = array.length;
		modifyArray(array,len);
		//modifyArray(array);
	}
}