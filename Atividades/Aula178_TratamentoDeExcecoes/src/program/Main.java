package program;

import entities.Account;
import exceptions.AccountException;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.nextLine();
        sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account ac = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            ac.withdraw(amount);
            System.out.printf("New Balance: %.2f%n", ac.getBalance());
        } catch (AccountException e){
            System.out.println(e.getMessage());
        }


    }

}