package designpattern;

public class BuilderDP {
    private String name;
    private String company;
    private int age;
    private boolean hasCar;
    private boolean hasBike;

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }


    private BuilderDP(EmployeeBuilder empBuilder) {
        this.name = empBuilder.name;
        this.company = empBuilder.company;
        this.age = empBuilder.age;
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private int age;
        private boolean hasCar;
        private boolean hasBike;
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }



        public EmployeeBuilder(String name, String company, int age) {
            this.name = name;
            this.company = company;
            this.age = age;
        }
       public BuilderDP build(){
            return new BuilderDP(this);
       }
    }

    public static void main(String[] args) {
        BuilderDP builderDP = new BuilderDP.EmployeeBuilder("Ram","google", 29).setHasBike(true).setHasCar(false).build();
        System.out.println(builderDP);

    }
}
