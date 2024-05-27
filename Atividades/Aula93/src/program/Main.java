package program;
import java.util.Scanner;
import java.util.Locale;
import utilities.Quartos;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();
        sc.nextLine();

        Quartos[] quartos = new Quartos[10];

        for (int i = 0; i < n; i++) {
            System.out.println("What is the " + (i+1) + " room information?");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            quartos[room] = new Quartos(name, email, room);
        }

        System.out.println("Busy Rooms: ");
        for (Quartos quarto : quartos) {
            if (quarto != null) {
                System.out.println(quarto.toString());
            }
        }

    }
}