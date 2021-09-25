package packagetest;

public class Deposit extends Transaction {
	public Deposit(double bal)
	{
		balance = bal;
	}


	 public void maketransaction(double amount)
	{

		balance = balance + amount;
		
	
	}
	 
	 public double getBalance()
	 
	 {
		 return balance; 
	 }


}
