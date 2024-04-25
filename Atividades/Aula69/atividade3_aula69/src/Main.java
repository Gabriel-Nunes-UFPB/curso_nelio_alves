import util.Student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("NAME: ");
        student.name = sc.nextLine();

        System.out.println("GRADE 1: ");
        student.grade1 = sc.nextDouble();
        System.out.println("GRADE 2: ");
        student.grade2 = sc.nextDouble();
        System.out.println("GRADE 3: ");
        student.grade3 = sc.nextDouble();


        System.out.println(student.aprovacao());

    }
}