package Ducat.ducat.multiThreading;

/*To check main method is a thread or not
Thread cannoit be called.
Thread can be start.
Thread can be run.
*/
public class Threading {

    public static void main(String[] args) {

        System.out.println("Threading main starts...........................");

        // to know the name of current running thread.
        System.err.println("Current running thread name is: " + Thread.currentThread().getName());
        System.out.println("Threading main ends..............................");
    }

}
