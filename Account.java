public class Account {
	private String name;
	private double balance;
	
	public double withdraw;
	
	public Account(String name, double balance, double withdraw) {
		this.name = name;

		if (balance > 0.00) {
			this.balance = balance;
		}
		
		if (withdraw <= balance) {
			this.withdraw = withdraw;
		}
	}

//method that deposits (adds) to the balance 
	public void deposit(double depositAmount) {
		if (depositAmount > 0.00) {
	  		 balance = balance + depositAmount;
		}
	}

//method that withdraws (minus) from the balance
	public double withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
		System.out.println("Transaction Successful!");
		}
		if (withdrawAmount > (balance+1)) {
		System.out.println("Withdrawal amount exceeded account balance.");
		
		}
	return balance; 
}

	public double getBalance() {
		return balance;	
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	} 

	
}