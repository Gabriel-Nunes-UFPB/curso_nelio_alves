package program;
import java.util.Scanner;
import utilities.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão serão analisadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Dados[] dados = new Dados[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite o nome da pessoa nº" + (i+1) +" :");
            String name = sc.nextLine();

            System.out.println("Digite a idade da nº" + (i+1) +" :");
            int age = sc.nextInt();

            System.out.println("Digite a altura da nº" + (i+1) +" :");
            double height = sc.nextDouble();
            sc.nextLine();

           dados[i] = new Dados(name, age, height);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += dados[i].getHeight();
        }
        double alturaMedia = sum / n;
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        System.out.println("Pessoas com menos de 16 anos: ");
        double countMenores16 = 0;
        for (int i = 0; i < n; i++) {
            if (dados[i].getAge() < 16) {
                countMenores16++;
            }
        }
        if(countMenores16  > 0) {
            for(int i=0; i<n; i++) {
                if(dados[i].getAge() < 16) {
                    System.out.println(dados[i].getName());
                }
            }
        } else{
            System.out.println("Não há menores de 16 anos");
        }

        double porcentagemMenores16 = (countMenores16 / n) * 100;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", porcentagemMenores16);

    }
}