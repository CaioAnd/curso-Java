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
    
        System.out.printf("Gross salary: ");
        
        System.out.printf("Tax: ");
        

        sc.close();
    }
}
