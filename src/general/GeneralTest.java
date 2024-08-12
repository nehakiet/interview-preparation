package general;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class GeneralTest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(1, 2);
        hm.put(1, 3);
       System.out.println(hm.size());
        highestSale();
        System.out.println(sortEmployee());
    }

    private static void highestSale() {
        List<Company> list = new ArrayList<>();
        list.add(new Company("sapient", "$20000"));
        list.add(new Company("Reliance jio", "$90000"));
        list.add(new Company("wipro", "$15000"));
        list.add(new Company("LTImindtree", "$70000"));
        list.add(new Company("Navyug", "$10000"));
        list.sort((Comparator.comparing(Company::getHighestSales)).reversed());
        list.stream().limit(2).forEach(System.out::println);
        list.sort(Comparator.comparing(Company::getHighestSales).thenComparing(Company::getBranchName));

    }

    private static List<Employee> sortEmployee() {
        List<Employee> emplist = new ArrayList();
        emplist.add(new Employee("Neha", "07 / 07 / 1997", "3"));
        emplist.add(new Employee("Ram", "07 / 08 / 1998", "2"));
        emplist.add(new Employee("Shyam", "07 / 09 / 1999", "4"));
        emplist.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getDob));
        emplist.sort(Comparator.comparing(Employee::getId).thenComparing(Employee::getName).reversed());
        return emplist;
    }

}

