package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadPractice {
    private final int limit = 10;
    private final AtomicBoolean evenOddFlag = new AtomicBoolean(true);

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        ThreadPractice t1 = new ThreadPractice();
        es.execute(t1::printEven);
        es.execute(t1::printOdd);
    }

    private void printEven() {
        for (int i = 2; i < limit; i += 2) {
            synchronized (this) {
                while (!evenOddFlag.get()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                System.out.println("even no is :" + i);
                evenOddFlag.set(false);
                notify();

            }
        }
    }

    private void printOdd() {
        for (int i = 1; i < limit; i += 2) {
            synchronized (this) {
                while (evenOddFlag.get()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                System.out.println("odd no is :" + i);
                evenOddFlag.set(true);
                notify();

            }
        }
    }

}
