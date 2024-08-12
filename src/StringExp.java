import java.util.Arrays;
import java.util.stream.Collectors;

public class StringExp {
    public static void main(String[] args) {
        String str = "0120450";
        String[] s1 = str.split("");
        System.out.println(Arrays.stream(s1).filter(c->!c.contains("0")).collect(Collectors.joining()));

// System.out.println(str.chars().filter(c->c!='0').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining()));


// OR using replace
        String str1=str.replace("0","");
        System.out.println(str1);
    }
//insert into general.Employee (name,age,email) values ("",)
//  Alter Table general.Employee
//  modify column age varchar(10);

}
