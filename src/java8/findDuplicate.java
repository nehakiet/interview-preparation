package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class findDuplicate {
    public static void main(String[] args) {
        findDuplicate();

        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            es.submit(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("i am executing executor service" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                }

            });
        }
        es.shutdown();
    }

    private static void findDuplicate() {
        List<Integer> num = Arrays.asList(10, 15, 49, 98, 98, 15);
        Set<Integer> hashSet = new HashSet<>();
        num.stream().filter(n -> !hashSet.add(n)).forEach(System.out::println);
    }
}