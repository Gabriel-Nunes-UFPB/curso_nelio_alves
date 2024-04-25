import java.util.Scanner;
import util.employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Gross Salary: ");
        double grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        double tax = sc.nextDouble();

        employee employee = new employee(name, grossSalary, tax);

        System.out.println("employee: " + name + ", Net Salary: $" + employee.netSalary());
        System.out.println("Which percentage to increase salary?");
        double percentageIncreasySalary = sc.nextDouble();
        employee.increaseSalary(percentageIncreasySalary);

        System.out.println("Updated data: " + name + ", Net Salary: " + employee.netSalary());


    }
}