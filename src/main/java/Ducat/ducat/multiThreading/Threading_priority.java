package Ducat.ducat.multiThreading;

/*
Thread Priorities
Threads have priorities. Thread class have constants
1.MAX_PRIORITY (10),
2.NORM PRIORITY (5) - Default
3. MIN_PRIORITY (1),
getPriority and setPriority are the methods to deal with priority of threads.
When two threads (Thread 2 and Thread 3) having the same priorities and arrival time, the scheduling will be decided on the basis of FCFS algorithm

join() ka use ek thread ko dusre thread ke complete hone tak wait karwane ke liye kiya jata hai. 
Jab kisi thread par join() call kiya jata hai, to current thread tab tak ruk jata hai jab tak target thread apna execution complete na kar le.

Daemon thread in Java is a service provider thread that provides services to the user thread for background supporting task.. Its life depend on the mercy of user threads i.e. when all the user threads dies,
JVM terminates this thread automatically.
*/

class MyThread4 extends Thread {
    public MyThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Thread is: " + Thread.currentThread().getName() + " i: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class Threading_priority {

    public static void main(String[] args) {

        System.out.println("Thread starts");

        MyThread4 t5 = new MyThread4("Mythread-1");
        // t5.setPriority(Thread.MAX_PRIORITY); // setting priority to maximum priority
        t5.start();
        try {
            t5.join();// waiting for thread 1 to complete before starting thread 2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread4 t6 = new MyThread4("Mythread-2");
        t6.start();
        try {
            t6.join();// waiting for thread 2 to complete before starting thread 3
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        MyThread4 t7 = new MyThread4("Mythread-3");
        t7.start();

        System.out.println("Thread ends");

    }

}
