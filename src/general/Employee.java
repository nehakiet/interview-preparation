package general;

public class Employee {
    private String name;
    private String dob;
    private String id;

    public Employee(String name, String dob, String id) {
        this.name = name;
        this.dob = dob;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "general.Employee{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
