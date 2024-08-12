package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComparatorExample {
    public static void main(String[] args) {
        nameComparator();
        AgeComparator();

    }

    private static void nameComparator() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("\nAfter sorting by name:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void AgeComparator() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people,Comparator.comparingInt(Person::getAge));

        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
