

import static org.junit.Assert.*;

import org.junit.Test;

import packagetest.Deposit;

import org.junit.Before;
import org.junit.Assert;

public class DepositUnit{ 
	
	Deposit d;
	
	@Before
	public void setUp() {
		
		
	 d = new Deposit(5000);

}
	



	@Test
	public void testDeposit() {
		
	
		double balance_dp=5000;
		
		double expectedResult=10000;
		
		d.maketransaction(balance_dp);
		
		
		Assert.assertEquals(expectedResult,d.getBalance(),0.0);
		
	}

}
