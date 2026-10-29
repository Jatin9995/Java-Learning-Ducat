package Ducat.ducat.Exception;

/*
it creates exception object manually by the programmer and handover to JVM.
it is used for customized exception. We cannot write any statement after throw statement], othewise it will provide unreachable statement error.
Throw exception instance ko JVM ko handover kr deta hai.
 */

class TxnNotSupportedException2 extends Exception { // Exception class ko extend kiya hai TxnNotSupportedException class
                                                    // mein.

    public TxnNotSupportedException2(String msg) {
        super(msg); // Exception class ka constructor call kiya hai. msg parameter pass kiya hai.

    }

}

public class throw_exception {

    static int totalAmount = 2000;

    public static void withdraw(int reqAmt) {
        if (reqAmt > totalAmount) {
            try {
                // TxnNotSupportedException ka object create kiya hai
                throw new TxnNotSupportedException2("\nInsufficiend funds for transaction. Please try again. ");

            } catch (TxnNotSupportedException2 e) {
                e.printStackTrace();

            }

        } else {
            System.out.println("Transaction successful. Please collect your money. ");

        }

    }

    public static void main(String[] args) {

        withdraw(3000);
        System.out.println("Done");

    }

}
