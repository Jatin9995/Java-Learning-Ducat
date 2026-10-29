package Ducat.ducat.encapsulation;

class BankAccount{
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		if(accountNumber>=100000 && accountNumber<=999999) {
		this.accountNumber = accountNumber;
	}else {
		System.out.println("Error: Account number must be exactly 6 digits.");
	}
		
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		if(accountHolderName !=null && !accountHolderName.trim().isEmpty()) {
		this.accountHolderName = accountHolderName;
		}else {
			System.out.println("Invalid account holder name.");
		}
	}
	
	public void deposit(int amount) {
		if(amount>0) {
		balance= balance + amount;
		}else {
			 System.out.println("Deposit amount must be positive.");
		}
	}
	
	public void withdraw(int amount) {
		if(amount>0 && amount<=balance) {
		balance=balance-amount;
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
	public double checkBalance() {
		return balance;

	
	
}
	

}

public class EncaptulationsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account=new BankAccount();
		account.setAccountHolderName("Jatin Rout");
		System.out.println("Name of the Account Honder: " + account.getAccountHolderName());
		
		account.setAccountNumber(100001);
		System.out.println("Account number: " + account.getAccountNumber());
		
		account.deposit(10000);
		account.checkBalance();
		System.out.println("Current balance: " + account.checkBalance());
		
		account.withdraw(5000);
		System.out.println("Balance after withdraw: " + account.checkBalance());
		
		

	}
}





