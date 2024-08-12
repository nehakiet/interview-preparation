import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");

        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        Random random = new Random();
        int randomIndex = random.nextInt(20); // Generates a random index between 0 and 19
        int selectedNumber = numbers[randomIndex];
        System.out.println("Randomly selected number: " + selectedNumber);
        scanner.close();
    }
}
