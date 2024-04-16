package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price:" );
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println();
        System.out.println("Second Updated data: " + product.toString());

        sc.close();
    }
}