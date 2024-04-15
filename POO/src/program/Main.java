package program;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);;

        double p, areaX, areaY;

        //Primeiramente é feita a declaração e instanciação das variáveis que utilizarão a classe Triangle.
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        //Para utilizar as variáveis criadas em Triangle é necessário usar as x e y, que fora declaras e instanciadas.
        //Ao usar x.a, y.a e as outras variações eu digo que x e y puxam, por exemplo, a variáveis a de Triangle
        System.out.println("Coloque as medidas dos lados do Triângulo X: ");
        System.out.println("Lado A: ");
        x.a = sc.nextDouble();
        System.out.println("Lado B: ");
        x.b = sc.nextDouble();
        System.out.println("Lado C: ");
        x.c = sc.nextDouble();
        p = (x.a + x.b + x.c)/2;
        areaX = Math.sqrt(p * (p-x.a) * (p-x.b) * (p-x.c));
        //Dessa forma, a variável do tipo Triangle x usado a, b e c que seriam "funções" de Triangle

        System.out.println("Coloque as medidas dos lados do Triângulo Y: ");
        System.out.println("Lado A: ");
        y.a = sc.nextDouble();
        System.out.println("Lado B: ");
        y.b = sc.nextDouble();
        System.out.println("Lado C: ");
        y.c = sc.nextDouble();
        p = (y.a + y.b + y.c)/2;
        areaY = Math.sqrt(p * (p-y.a) * (p-y.b) * (p-y.c));

        System.out.printf("Triângulo X área: %.2f%n", areaX);
        System.out.printf("Triângulo Y área: %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("ÁREA X É MAIOR!");
        } else{
            System.out.println("ÁREA Y É MAIOR!");
        }

    }
}