package entities;

public class employee {
    public String name;
    public double grossSalary;
    public double tax;

    public employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage/100;
    }

}
