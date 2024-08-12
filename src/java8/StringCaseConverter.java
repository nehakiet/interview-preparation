package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
        strings.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        strings.stream().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);

        String s1 = "i am smart";
        String[] str = s1.split("");
        Map<String, Long> hm = Arrays.stream(str).filter(s-> s !=" ").collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String,Long> map : hm.entrySet()) {
            String s = map.getKey() + "," + map.getValue();
            System.out.println(s);
         }

        int[] a= {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.stream(a).filter(b->b%2==0).sum());

//        employees.sort(Comparator.comparing(general.Employee::getName)
//                .thenComparing(general.Employee::getDepartment));
//
//        // Print sorted employees
//        employees.forEach(System.out::println);
    }
}
