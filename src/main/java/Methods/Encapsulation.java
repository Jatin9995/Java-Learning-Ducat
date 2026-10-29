package Methods;

/*
 * Encapsulation in Java means keeping variables and methods together inside a class and protecting the 
 * variables from being accessed directly from outside the class.
 * ex: capsule and car
 * technically every class is an example of encapsulation.
 * To achieve proper encapsulation there are certain rules.
 * 1. Declare all variables as private.
 * 2. Provide public getter and setter method.
 * Getter and setter methods are used in encapsulation to protect the variable and give controlled access to it.
 * setter is used to set or update the value.
 * getter is used to get or read the value.
 * use of encapsulation
 * 1. protects data
 * 2. controls data access
 * 3. allows data validation
 * 4. prevents unauthorized or accidental modification
 * 5. improves code maintainability and flexibility
 */


class Account{

	private	String accountHolder;  //first rule implemented. private variable
	private	double balance;   //first rule implemented. private variable
	
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount>0) {
			balance = balance + amount;
			System.out.println("You have deposited " + amount + "rs.");
			System.out.println("New balance is " + getBalance() + "rs.");
			
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	
	public void withdraw(double amount) {
		
		if (amount>0) {
			balance=balance-amount;
			System.out.println("you have withdrawl " + amount+ "rs.");
			System.out.println("New balance is " + getBalance());
		}else {
			System.out.println("Invalid amount");
		}
		
	}



}


public class Encapsulation {

	public static void main(String[] args) {
		
		Account account=new Account();
		account.setAccountHolder("Jatin Rout");
		System.out.println(account.getAccountHolder());
		account.deposit(10000);
		account.withdraw(5000);
	}

}
