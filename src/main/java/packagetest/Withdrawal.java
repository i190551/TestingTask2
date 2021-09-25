package packagetest;

public class Withdrawal extends Transaction {
	
	
	public Withdrawal (double balance)
	{
		this.balance = balance;
		
	}


	public void maketransaction(double amount)
	{
		
		
		if (balance >= amount)
		{
			balance= balance - amount;
		
			
			System.out.println( "Take your Cash. Thankyou.");
		
			
		}

		
		  else 
		  { 
			  
			  System.out.println("Balance  Insufficient");
			  System.out.println("Total Balance = $"+balance+" \nRestart the program");
			  
			  System.exit(0);
			  
		  
		  
		  }
	

		
	
	}

	
 public double getBalance()
	 
	 {
		 return balance; 
	 }

	

}
