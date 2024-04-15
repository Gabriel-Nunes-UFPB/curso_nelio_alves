import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double priece1 = 2100.0;
        double priece2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: %n%s, witch price is U$ %.2f%n%s, which price is U$ %.2f%n %n", product1, priece1, product2, priece2);
        System.out.printf("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%nRouded (three decimal places): %.3f%n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}