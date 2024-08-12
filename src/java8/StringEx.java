package java8;

public class StringEx {

    public static void main(String[] args) {

        //general.Employee emp = new general.Employee.EmpBuilder().setId("3").setName("Ram").build();
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);
        String str = null;
        System.out.println(str.valueOf(10));
//        The valueOf(int) method is a static method in String that returns the String representation of the integer value that is passed as its argument.
//        Since calling a static method does not require dereferencing the reference variable on which it is called, this program does not throw a NullPointerException.
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
