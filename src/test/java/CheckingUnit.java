

import static org.junit.Assert.*;

import org.junit.Test;

import packagetest.Checking;

import org.junit.Before;
import org.junit.Assert;

public class CheckingUnit{ 
	
	Checking check_ac;
	
	@Before
	public void setUp() {
		
		
	 check_ac = new Checking();

}
	



	@Test
	public void testZakat() {
		
	
		double balance_checking=500000;
		
		check_ac.setBalance(balance_checking);
		
		double expectedResult=12500;
		
		check_ac.calculateZakat();
	
		
		Assert.assertEquals(expectedResult,check_ac.calculateZakat(),0.0);
		
	}

}
