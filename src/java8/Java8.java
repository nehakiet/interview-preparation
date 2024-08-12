package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        charFrequency();
        numFrequency();

    }

    private static void numFrequency() {
        Map<Integer, Long> numFreq = Arrays.asList(2, 10, 10, 12, 41, 41, 2, 2, 2).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        numFreq.forEach((Number, Frequency) -> System.out.println(Number + "," + Frequency));
    }

    private static void charFrequency() {
        String str = "this ttt";
        String[] arr = str.split("");
        Map<String, Long> hm = Arrays.stream(arr).filter(c -> c != " ")
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> maxEntry = null;
        for (Map.Entry<String, Long> entry : hm.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;

            }
        }
        if (maxEntry != null) {
            System.out.println("highest frequency character " + maxEntry);
        } else {
            System.out.println("maxEntry is null");
        }
    }
}
