import java.util.Date;

public final class ImmutableClass {
    private final String name;
    private final int age;
    private final Date dateOfBirth;

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public ImmutableClass(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public static void main(String[] args) {
       Date date = new Date();
       ImmutableClass immutableClass = new ImmutableClass("Ram",30,date);
        System.out.println("Before modification: " + immutableClass);

        date.setTime(System.currentTimeMillis() + 1000000000L);

        System.out.println("After modification: " + immutableClass);
    }
}
