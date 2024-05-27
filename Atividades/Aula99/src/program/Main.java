package program;
import entities.Employee;

import java.security.spec.ECField;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many exployees will be registered?");
        int employeesRegistered = sc.nextInt();

        for (int i = 0; i < employeesRegistered; i++) {
            System.out.println("Insert the Employee #" + (i + 1) + " ID: ");
            int employeeId = sc.nextInt();
            employeeId = getEmployeeId(employeesList, employeeId, sc);
            System.out.println("Insert the Employee Name: ");
            String employeeName = sc.next();
            System.out.println("Insert the Employee Salary: ");
            sc.nextLine();
            double employeeSalary = sc.nextDouble();


            employeesList.add(new Employee(employeeId, employeeName, employeeSalary));

        }

        System.out.println("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employeesList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            int percentage = sc.nextInt();
            emp.increaseSalary(percentage);
        }
        for(Employee employee : employeesList) {
            System.out.println(employee.toString());
        }

    }

    private static int getEmployeeId(List<Employee> employeesList, int employeeId, Scanner sc) {
        for(Employee employee : employeesList) {
            while(employeeId == employee.getId()) {
                System.out.println("This ID already exists. Try again: ");
                employeeId = sc.nextInt();
            }
        }
        return employeeId;
    }
}