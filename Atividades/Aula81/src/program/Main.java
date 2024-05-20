package program;

import Bank.Account;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        double amount;
        boolean exit = true;

        Account account = null;

        Scanner sc = new Scanner(System.in);
        while (exit == true) {
            userInterface();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Criar Conta Selecionado!");
                    System.out.println("--------------------------------------");
                    System.out.println("Diga seu nome: ");
                    String name = sc.nextLine();
                    System.out.println("Diga o seu número de account: ");
                    int countNumber = sc.nextInt();
                    sc.nextLine();

                    double deposit = 0;

                    System.out.println("Deseja fazer um depósito inicial? (Y/N)");
                    String answer = sc.nextLine();

                    while (!Objects.equals(answer, "Y") && !Objects.equals(answer, "N")) {
                        System.out.println("Entrada inválida. Por favor, digite Y para sim ou N para não.");
                        answer = sc.nextLine();
                    }

                    if (answer.equals("Y")) {
                        System.out.println("Digite o valor do depósito inicial: ");
                        deposit = sc.nextDouble();
                        sc.nextLine();
                    }

                    account = new Account(countNumber, name, deposit);
                    System.out.println("Conta criada com sucesso!");
                    System.out.println(account.toString());
                    System.out.println("--------------------------------------");
                    break;

                case 2:
                    if (conutNull(account)) break;
                    System.out.println("Saldo atual: " + account.getBalance());
                    System.out.println(account.toString());
                    System.out.println("--------------------------------------");
                    break;

                case 3:
                    System.out.println("Deposito");
                    if (conutNull(account)) break;
                    System.out.println("Digite o valor a ser depositado: ");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    sc.nextLine();

                    System.out.println("Foi depositado: " + amount);
                    System.out.println(account.toString());
                    System.out.println("--------------------------------------");
                    break;

                case 4:
                    System.out.println("Saque");
                    if (conutNull(account)) break;
                    System.out.println("Digite o valor a ser sacado: ");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    sc.nextLine();

                    System.out.println("Foi depositado: " + amount);
                    System.out.println(account.toString());
                    System.out.println("--------------------------------------");
                    break;

                case 5:
                    if (conutNull(account)) break;

                    System.out.println(account.toString());
                    System.out.println("--------------------------------------");
                    break;

                case 6:
                    System.out.println("Saindo.....");
                    exit = false;
                    System.out.println("--------------------------------------");
                    break;
            }

        }
    }

    private static boolean conutNull(Account account) {
        if(account == null){
            System.out.println("Nenhuma account encontrada. Por favor, crie uma account primeiro.");
            System.out.println("--------------------------------------");
            return true;
        }
        return false;
    }

    private static void userInterface() {
        System.out.println("Bem vindo ao Banco Feliz, por favor diga a operação desjada :)");
        System.out.println("""
                --------------------------------------
                [1] - Criar Conta
                [2] - Saldo
                [3] - Deposito
                [4] - Saque
                [5] - Informações da Conta
                [6] - Sair
                --------------------------------------
                """);
    }
}