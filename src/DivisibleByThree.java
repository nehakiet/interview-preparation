import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isdivisibleByThree(n));

    }

    private static String isdivisibleByThree(int n) {
//        HashMap<Integer,String>hm = new HashMap<>();
//        hm.put(0,"yes");
//        hm.put(1,"No");
//        hm.put(2,"No");
        String[] arr = {"yes", "No", "No"};
        int reminder = n % 3;
        return arr[reminder];
    }

}


