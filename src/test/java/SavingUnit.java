

import static org.junit.Assert.*;

import org.junit.Test;

import packagetest.Saving;

import org.junit.Before;
import org.junit.Assert;

public class SavingUnit{ 
	
	Saving saving_ac;
	
	@Before
	public void setUp() {
		
		
	 saving_ac = new Saving();

}
	



	@Test
	
	public void testZakat2() {//zakat rate is 2.5%
		
	
		double balance_savng=50000;
		
		saving_ac.setBalance(balance_savng);
		
		double expectedResult=1250;
		
		saving_ac.calculateZakat();
	
		
		Assert.assertEquals(expectedResult,saving_ac.calculateZakat(),0.0);
		
	}
	
	
	@Test
	public void testInterest()
	{
		double balance_saving=36000;
		
		saving_ac.setBalance(balance_saving);
		
		double expectedResult=540;
				
		saving_ac.calculateInterest();
	
		System.out.println(saving_ac.calculateInterest());
		
		Assert.assertEquals(expectedResult,saving_ac.calculateInterest(),0.0);
	}
	
	
	}


