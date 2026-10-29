package Ducat.ducat.encapsulation;

class ATMAccount {

    private int accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;
    private String gender;

 

    public void setAccountNumber(int accountNumber) {
        if (accountNumber >= 100000 && accountNumber <= 999999) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number. It should be a 6-digit number.");

        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // -----------------------------------------

    public void setAccountHonderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;

        } else {
            System.out.println("Invalid account holder name. It cannot be null or empty.");
        }

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // ------------------------------------------------------------------

    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;

        } else {
            System.out.println("Invalid PIN. It should be a 4-digit number.");
        }

    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. Current balance: " + balance);

        } else {
            System.out.println("Invalid deposit amount. It should be greater than zero.");
        }

    }

    // --------------------------------------------------------------------
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful. Current balance: " + balance);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }

    }

    // --------------------------------------------------------------------

    public double checkBalance(int enterePin) {
        if (enterePin == pin) {
            return balance;

        } else {
            System.out.println("Invalid PIN. Please try again.");
            return -1; // Return -1 to indicate an error in checking balance due to invalid PIN
        }
       

    }

    public void setchangePin(int oldPin, int newPin){
        if (oldPin == pin) {
            if (newPin >= 1000 && newPin <= 9999) {
                if(oldPin != newPin) {
                    pin = newPin;
                    System.out.println("PIN changed successfully.");
                } else {
                    System.out.println("New PIN cannot be the same as the old PIN.");

                }
            } else {
                System.out.println("Invalid new PIN. It should be a 4-digit number.");
            }
        } else {
            System.out.println("Incorrect old PIN.");


    }

}

}

public class encapsulationATMAccount {

    public static void main(String[] args) {

        ATMAccount account=new ATMAccount();
        account.setAccountHonderName("Jatin Rout");
        account.setAccountNumber(123456);
        account.setPin(1234);
        account.deposit(10000);
        account.withdraw(4000, 1234);
        account.checkBalance(1234);
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.checkBalance(1234));
        account.setchangePin(1234, 5678);
        account.withdraw(2000, 5678);
        account.checkBalance(5678);

    }

}

