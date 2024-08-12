package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExecutorServiceExp {
    private final int limit = 20;
    private final AtomicBoolean evenOddFlag = new AtomicBoolean(true);

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        ExecutorServiceExp esx = new ExecutorServiceExp();
        es.execute(esx::printEven);
        es.execute(esx::printOdd);

    }

    private void printEven() {
        for (int i = 2; i <= limit; i += 2) {
            synchronized (this) {
                while (!evenOddFlag.get()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("even no is " + i);
                evenOddFlag.set(false);
                notifyAll();
            }
        }
    }

    private void printOdd() {
        for (int i = 1; i <= limit; i += 2) {
            synchronized (this) {
                while (evenOddFlag.get()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("odd no is:" + i);
                evenOddFlag.set(true);
                notifyAll();
            }
        }
    }

}
