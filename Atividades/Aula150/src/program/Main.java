package program;

import entites.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;
import entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        List<HourContract> contractsList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        Department departmentName = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.print("Name: "); String name =  sc.nextLine();
        System.out.print("Level: "); String level = sc.nextLine(); WorkerLevel.valueOf(level);
        System.out.print("Base Salary: "); double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, departmentName);

        System.out.print("How many contracts to this worker? "); int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter contract #" + (i + 1) + " data:");

            System.out.print("Date (DD/MM/YYYY): ");
            Date d01 = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

           worker.addContract(new HourContract(d01, valuePerHour, hours));
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        double income = worker.income(year, month);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + month + "/" + year + ": " + String.format("%.2f", income));

    }
}