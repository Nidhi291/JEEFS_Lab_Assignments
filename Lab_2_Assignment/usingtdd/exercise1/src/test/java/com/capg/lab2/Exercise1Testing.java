package src.test.java.com.capg.lab2;

import static org.junit.Assert.assertTrue;

import src.test.java.com.capg.lab2.lab2exercise1.Exercise1;
import src.test.java.com.capg.lab2.lab2exercise1.Test;

public class Exercise1Testing 
{
	/**
     * Rigorous Test :-)
     */
	private Exercise1 exercise1;
	
	public void setup()
	{
		exercise1 = new Exercise1();
	}
    @Test
    public void second_smallesttest_GivenEmptyArray_ShouldReturn0()
    {
    	int num[] = {};
    	int result = exercise1.getSecondSmallest(num);
    	assertEquals(0,result);
    }
    
    public void second_smallesttest_Given2ElementsInArray_ShouldReturnSecondSmallest()
    {
    	int num[] = {8,2};
    	int result = exercise1.getSecondSmallest(num);
    	assertEquals(8,result);
    }
    
    public void second_smallesttest_Given3ElementsInArray_ShouldReturnSecondSmallest()
    {
    	int num[] = {9,1,7};
    	int result = exercise1.getSecondSmallest(num);
    	assertEquals(7,result);
    }
    /**
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    */  
}
