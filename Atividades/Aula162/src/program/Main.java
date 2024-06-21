package program;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print(" Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours:");
            int hours = sc.nextInt();
            System.out.print("Value per hour:");
            sc.nextLine();
            double valuePerHour = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional charge:");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour,additionalCharge);
                employeeList.add(emp);
            }else{
                Employee emp = new Employee(name, hours, valuePerHour);
                employeeList.add(emp);
            }
        }
        System.out.println("Payments:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }
}