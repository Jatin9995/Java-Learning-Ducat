package Ducat.ducat.multiThreading;

/*
Daemon Thread background me chalne wala thread hota hai, jiska life user threads par depend karta hai. 
Jaise hi saare user threads khatam hote hain, JVM daemon thread ko bhi terminate kar deti hai.
jab program start hota hai to pehle main thread start hota hgai JVM k trough. uske baad demaon thread start hota hai. to JVM k paas 2 thread hote hain. main thread aur daemon thread.
demon thread start hua hai lekin run nahi hua. JVM decide karta hai threadscheduler me ki kisko pehjle CPU dena hai. pehle main ko mili to run hoke terminate ho gaya iske demon running print nahi hua.
because run he nahi hua.

Daemon Thread ko set karna padta hai setDaemon(true) method se. 
Jaise hi main thread khatam hote hain, JVM daemon thread ko bhi terminate kar deti hai. islye demoj thread print nahi hia niche.
 */

public class DemonThread extends Thread {

    @Override
    public void run() {
        System.out.println("Demon Thread is running");

    }

    public static void main(String[] args) {

        DemonThread d1 = new DemonThread();
        d1.setDaemon(true);
        d1.start();

        System.out.println(Thread.currentThread().getName() + " is running");

    }

}
