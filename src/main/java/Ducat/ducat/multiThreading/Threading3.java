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

//Thread class k andar 2 method inbuild hote hai. 1st run & 2nd start. Hum start() ko start karte hai to JVN run() method ko automatically run karta hai
class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

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

public class Threading3 {

    public static void main(String[] args) {

        MyThread3 t5 = new MyThread3("Mythread-1"); // setting the name of the thread in () and will be using
                                                    // constructor

        t5.start(); // we can start thread cannot call thread. so we used start method which is
                    // bydefault in thread class. (Thread-0)

        MyThread3 t6 = new MyThread3("Mythread-2");// (Thread-1)
        t6.start();

        MyThread3 t7 = new MyThread3("Mythread-3");// (// Thread-2)
        t7.start();

    }

}
