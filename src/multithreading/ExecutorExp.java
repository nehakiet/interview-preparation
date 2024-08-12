package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExp {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(4);
        for(int i=0;i<5;i++) {
            es.submit( ()->{
                try {
                    Thread.sleep(1000);
                    System.out.println("print something " + Thread.currentThread().getName());

                } catch (InterruptedException ex) {

                }

            });
        }
        es.shutdown();
    }

}

