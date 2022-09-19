import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args) {
	
	Account account1 = new Account("Adewunmi", 20.00, 0.00);
	Account account2 = new Account("Amirah", -50.00, 0.00);

	System.out.printf("%s balance: $%.2f%n%n", account1.getName(), 			    	 	
	account1.getBalance());

	System.out.printf("%s balance: $%.2f%n%n", account2.getName(), 	  	 	           		
	account2.getBalance());
	
	Scanner input = new Scanner(System.in);

	System.out.printf("Enter deposit amount for %s: ", account1.getName());
	double depositAmount = input.nextDouble();
	
	System.out.printf("%nAdding %.2f to %s's balance%n%n", 
		depositAmount, account1.getName());
	account1.deposit(depositAmount);
		
	System.out.printf("%s's balance: %.2f%n%n", account1.getName(),
		account1.getBalance());
	
	System.out.printf("Enter deposit amount for %s: ", account2.getName());
		depositAmount = input.nextDouble();
	
	System.out.printf("%nAdding %.2f to %s's balance%n%n", depositAmount, 			
	account2.getName()); 
	
	account2.deposit(depositAmount);

	System.out.printf("%s's balance: %.2f%n%n", account2.getName(), 
		account2.getBalance()); 
	
	System.out.printf("Enter withdraw amount from %s's balance($%.2f): ", 			
	account1.getName(), account1.getBalance());
	double withdrawAmount = input.nextDouble();
	
	System.out.printf("Withdraw $%.2f from %s's account balance ($%.2f) %n%n", 			
	withdrawAmount, account1.getName(), account1.getBalance());
	
	 account1.withdraw(withdrawAmount);
	 
	System.out.printf("Enter withdraw amount from %s's balance ($%.2f): ", 		
	account2.getName(), account2.getBalance());
	withdrawAmount = input.nextDouble();
	
	System.out.printf("Withdraw $%.2f from %s's account balance ($%.2f) %n%n", 			
	withdrawAmount, account2.getName(), account2.getBalance());
	 account2.withdraw(withdrawAmount);
	 
	}

	

}