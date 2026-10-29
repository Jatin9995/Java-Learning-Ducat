package Ducat.ducat.encapsulation;



class ATMAccount2{
	
	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double balance;
	
	//pin
	public void setPin(int pin) {
		if (pin>=1000 && pin<=9999) {
			this.pin=pin;			
		}else {
			System.out.println("Invalid pin: Pin must be exactly 4 digit");
		}
		
	}

	public int getPin() {
		return pin;
	}
	
	public void setaccountNumber(int accountNumber) {
		if(accountNumber>=100000 && accountNumber<=999999) {
		this.accountNumber=accountNumber;	
		}else {
			System.out.println("Invalid account number: Account number should be atlest 6 digit");
		}
		
	}
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	
	public void accountHonderName(String accountHolderName) {
		if (accountHolderName !=null && !accountHolderName.trim().isEmpty()) {
			this.accountHolderName=accountHolderName;
			
		}else {
			System.out.println("Invalid account holder name. It cannot be null or empty.");
		}
		
	}
	
	public String getAccountHolderName() {
        return accountHolderName;
    }
	
	//deposit
	public void deposit(double amount) {
	if(amount>0) {
		balance=balance + amount;
		System.out.println("Deposit successful. Current Balance : " + balance);
		
	}else {
		System.out.println("Invalid deposit amount. It should be greater than 0");
	}
}

	//withdraw
	public void withdraw(double amount, int enteredPin) {
		if(enteredPin==pin) {
			if(amount>0 && amount<=balance) {
				balance=balance -amount;
				System.out.println("Balance withdraw successfull. Current balance: " + balance);
				
			}else {
				System.out.println("Invalid withdrawal amount or insufficient funds.");
			}
			
		}else {
			System.out.println("Invalid PIN. Please try again.");
		}
		
	}
	
	public void checkBalance(int enteredPin) {
		if(enteredPin==pin) {
			 System.out.println("Current Balance: " + balance);
			
			
		}else {
			 System.out.println("Invalid PIN. Please try again.");
		}
		
	}

	public void displayAccountInfo() {
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("PIN: " + pin);
	}

	
	
	
}



public class ATMmachineEncapsulation {

	public static void main(String[] args) {
		
		
		ATMAccount2 account=new ATMAccount2();
		account.accountHonderName("Jatin Rout");
	//	System.out.println("Account Holder name: " + account.getAccountHolderName());
		account.setaccountNumber(123456);
	//	System.out.println("Account Number : " +  account.getaccountNumber());
		account.deposit(10000);
		account.setPin(1234);
		account.withdraw(5000, 1234);
		account.checkBalance(1234);
		account.displayAccountInfo();
	}

}
