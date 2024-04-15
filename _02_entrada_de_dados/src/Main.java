import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

       //para se obter a entrada de dados deve-se criar um scanner
        //utilizei sc, mas pode ser qualquer outro nome, pois é uma variável
        Scanner sc = new Scanner(System.in);
        //o sc.next serve para "captar" a palavra chave

        String x;
        System.out.print("Digite algo: ");
        x = sc.next();

        System.out.print("Digite um número inteiro: ");
        int y = sc.nextInt();

        System.out.print("Digite um número double ");
        double z = sc.nextDouble();

        //o valor no parenteses equivale à posição da letra do print, começando a contagem no 0
        System.out.print("Digite outra palavra: ");
        char x1 = sc.next().charAt(0);


        System.out.println("Você digitou " + x);
        System.out.println("O número inteiro foi " + y);
        System.out.println("O número double foi " + z);
        System.out.println("O char foi " + x1);

        //usado para encerrar o uso do scanner
        sc.close();


    }
}