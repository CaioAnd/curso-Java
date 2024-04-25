package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increseSalary(double percentage) {
        grossSalary +=  grossSalary * percentage / 100;
    }

}
