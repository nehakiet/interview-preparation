package general;

public class Company {
    private String branchName;
    private String HighestSales;

    @Override
    public String toString() {
        return "Company{" +
                "branchName='" + branchName + '\'' +
                ", HighestSales='" + HighestSales + '\'' +
                '}';
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Company(String branchName, String highestSales) {
        this.branchName = branchName;
        HighestSales = highestSales;
    }

    public String getHighestSales() {
        return HighestSales;
    }

    public void setHighestSales(String highestSales) {
        HighestSales = highestSales;
    }



}
