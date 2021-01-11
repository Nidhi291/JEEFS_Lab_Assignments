import java.util.*;
class Exercise1
{
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
 public static void main(String args[])
 {
    int array[] = {1,5,3,4,6};
    System.out.println("Second smallest element in array is:" +getSecondSmallest(array));
 }
}