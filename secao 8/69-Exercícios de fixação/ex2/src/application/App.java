package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Employee employee = new Employee();

        System.out.printf("Name: ");
        employee.name = sc.nextLine();

        System.out.printf("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.printf("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("\nEmployee:  %s, $ %.2f\n", employee.name, employee.netSalary());

        System.out.printf("\nWhitch percentage to increase salaty? ");
        employee.increseSalary(sc.nextDouble());

        System.out.printf("\nUpdated data: %s, $ %.2f\n", employee.name, employee.netSalary());

        sc.close();
    }
}
