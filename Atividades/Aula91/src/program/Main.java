package program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Quantos números você vai digitar? ");
            n = sc.nextInt();
        } while (n > 10);

        double[] numbersList = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o  " + (i+1) + "º número");

            int x = sc.nextInt();

            if (x < 0) {
                numbersList[i] = x;
            }
        }

        System.out.println("Númeors negativos:");
        for (double number : numbersList) {
            if(number < 0){
            System.out.println(number);
            }
        }


    }
}