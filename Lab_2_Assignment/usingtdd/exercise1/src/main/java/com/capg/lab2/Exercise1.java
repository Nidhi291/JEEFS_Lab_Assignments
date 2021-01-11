package src.main.java.com.capg.lab2;

import src.main.java.com.capg.lab2.lab2exercise1.String;

public class Exercise1 
{
	public static void main(String args[])
    {
        //System.out.println( "Hello World!" );
    	int array[] = {1,5,3,4,6};
    	int secSmallest = getSecondSmallest(array);
    	System.out.println("Second smallest element is:" +secSmallest);
    }
	public static int getSecondSmallest(int array[])
    {
    	int temp;
    	for(int i=0; i<array.length; i++)
    	{
    		for(int j=i+1; j<array.length; j++)
    		{
    			if(array[i] > array[j])
    			{
    				temp = array[i];
    				array[i] = array[j];
    				array[j] = temp;
    			}
    		}
    	}
    	return array[1];
    }

}
