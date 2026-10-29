package Ducat.ducat.Exception;

//Throws: throws exception is responsible for handling exception at the method level. it throw the exception to the caller of the method.
//Throws is mainly used for compile time exceptions.

class TxnNotSupportedException1 extends Exception {

    public TxnNotSupportedException1(String message) {
        super(message);
    }

}

public class throws_exception1 {

    static int totalAmount = 5000;

    // throws exception is used here to handle the exception at the method level. it
    // throw the exception to the caller of the method.
    public static void withdrawl(int reqAmt) throws TxnNotSupportedException1 {

        if (reqAmt > totalAmount) {

            throw new TxnNotSupportedException1("\nInsufficiend funds for transaction. Please try again. ");

        } else {
            System.out.println("Transaction successful. Please collect your money. ");
        }

    }

    public static void main(String[] args) {

        try {
            withdrawl(7000);
        } catch (TxnNotSupportedException1 e) {

            e.printStackTrace();
        }
        System.out.println("Done");

    }

}
