import java.util.Scanner;
import entities.Rectangle;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Retangle width: ");
        double width = sc.nextDouble();

        System.out.println("Enter Rectangçe height: ");
        double height = sc.nextDouble();


        Rectangle area = new Rectangle();
        System.out.println("AREA: " + area.area(width, height));

        Rectangle perimeter = new Rectangle();
        System.out.println("PERIMETER: " + perimeter.perimeter(width, height));

        Rectangle diagonal = new Rectangle();
        System.out.println("DIAGONAL: " + diagonal.diagonal(width, height));

    }
}