import java.util.Arrays;
import java.util.*;
class Exercise3
{
	public static void reverseArray(int array[])
	{
		System.out.println("Reversed array");
		for (int i=array.length-1; i >= 0; i--) 
		{  
            System.out.println(array[i] + " ");
		}
		System.out.println("");
		getSorted(array);
	}
	public static void getSorted(int array[])
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] < array[j])
				{
				temp = array[i];
			    array[i] = array[j];
			    array[j] = temp;
				}
			}
		}
		System.out.println("Array sorted in descending order:");
		for (int i=0; i<array.length; i++)
        {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String args[])
    {
    	int array[] = {1,5,3,4,6};
		reverseArray(array);
	}
}	