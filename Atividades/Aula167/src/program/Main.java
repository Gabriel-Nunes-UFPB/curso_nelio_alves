package program;

import entities.*;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Tax payer " + (i+1) + " data:");
            System.out.print("Individual or company? " );
            char type = sc.next().charAt(0);

            if(type == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                listaPessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));

            } else if (type == 'c') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                listaPessoas.add(new PessoaJuridica(name, anualIncome, numberEmployees));
            }
        }
        System.out.println("TAXES PAID:");
        double totalTaxes = 0;

        for (Pessoa p : listaPessoas){
            System.out.println(p.getName() + " $ " + String.format("%.2f", p.tax()));
            totalTaxes += p.tax();

        }
        System.out.println("TOTAL TAXES: " + String.format("%.2f", totalTaxes));

    }

}