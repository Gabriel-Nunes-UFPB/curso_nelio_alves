package aplication;

import util.CurrencyConverter;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?" );
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        CurrencyConverter.dollarsBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.AmountToBePaid());

    }
}