package Ducat.ducat.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class pool implements Runnable {
    private String name;

    pool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(name + "===" + i);

        }

    }
}

public class ThreadPool {

    public static void main(String[] args) {

        Runnable r1 = new pool("task 1");
        Runnable r2 = new pool("task 2");
        Runnable r3 = new pool("task 3");
        Runnable r4 = new pool("task 4");
        Runnable r5 = new pool("task 5");
        Runnable r6 = new pool("task 6");
        Runnable r7 = new pool("task 7");
        Runnable r8 = new pool("task 8");
        Runnable r9 = new pool("task 9");
        Runnable r10 = new pool("task 10");
        Runnable r11 = new pool("task 11");
        Runnable r12 = new pool("task 12");
        Runnable r13 = new pool("task 13");
        Runnable r14 = new pool("task 14");
        Runnable r15 = new pool("task 15");
        Runnable r16 = new pool("task 16");
        Runnable r17 = new pool("task 17");

        System.out.println("Starting thread pool");

        // thread as fixed pool size
        ExecutorService pool = Executors.newFixedThreadPool(5);
        // Pass the task object to the thread pool to execute.
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r7);
        pool.execute(r8);
        pool.execute(r9);
        pool.execute(r10);
        pool.execute(r11);
        pool.execute(r12);
        pool.execute(r13);
        pool.execute(r14);
        pool.execute(r15);
        pool.execute(r16);
        pool.execute(r17);

        pool.shutdown();
        System.out.println("Thread pool shutdown");
    }
}
