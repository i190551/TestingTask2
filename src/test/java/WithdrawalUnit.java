

import static org.junit.Assert.*;

import org.junit.Test;

import packagetest.Withdrawal;

import org.junit.Before;
import org.junit.Assert;

public class WithdrawalUnit{ 
	
	Withdrawal w;
	
	@Before
	public void setUp() {
		
		
	 w = new Withdrawal(55000);

}
	



	@Test
	public void testWithdrawal() {
		
	
		double balance_wd=5000;
		
		double expectedResult=50000;
		
		w.maketransaction(balance_wd);
		
		
		Assert.assertEquals(expectedResult,w.getBalance(),0.0);
		
	}

}
