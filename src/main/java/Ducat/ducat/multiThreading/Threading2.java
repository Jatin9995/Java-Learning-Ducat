package Ducat.ducat.multiThreading;

/*
Thread can be created in 2 ways. by extending Thread class or implementing Runnable interface.
Runnable interface is more flexible and recommended to use. It allows multiple threads to run simultaneously.
Thread class is less flexible and recommended to use only when you need to extend the functionality of Thread class.
Runnable interface has only one method run() which is overridden by the subclass.
Thread class has two methods run() and start() which are overridden by the subclass.
Thread class has three methods sleep(), interrupt() and join() which are overridden by the subclass.

Difference between start() and run()

start()
New thread create karta hai.
Internally JVM run() call karti hai.
Multithreading hoti hai.

run()
Normal method hai.
New thread create nahi karta.
Sequential execution hota hai.
 */

//Thread class k andar 2 method inbuild hote hai. 1st run & 2nd start. to hum dono method ko overwride karenge
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Thread is: " + Thread.currentThread().getName() + " i: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class Threading2 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start(); // we can start thread cannot call thread. so we used start method which is
                    // bydefault in thread class. (Thread-0)

        MyThread t2 = new MyThread();// (Thread-1)
        t2.start();

        MyThread t3 = new MyThread();// (// Thread-2)
        t3.start();

    }

}
