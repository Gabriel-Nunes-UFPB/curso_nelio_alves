import java.util.Locale;
public class Main {
    public static void main(String [] args){
        ///print com quebra de linha
        System.out.println("Olá mundo");
        System.out.println("Bom dia");

        ///ao se colocar uma varíavel, é necessário declarar de que tipo ela é
        ///int = inteiro
        int a = 32;
        System.out.println(a);

        ///double = decimais
        double b = 10.2585624;
        System.out.println(b);

        //para controlar o número de casas a serem exibidias é necessário:
        // 1 - colocar printf ( print format )
        //2 - "%.Xf%n", variável ( X = número de casas )
        //obs: O valor pode sair arredondado
        System.out.printf("%.2f%n", b);
        System.out.printf("%.4f%n", b);

        //por padrão, o java coloca o separador numérico como o de base da linguagem do sistema, para resolver isso:
        //lembrete: importar antes até mesmo do public class
        Locale.setDefault(Locale.US);

        //apenas os números abaixo do comando anterior serão atualizados.
        System.out.printf("%.2f%n", b);
        System.out.printf("%.4f%n", b);

        //Para concatenar vários elementos em um mesmo comando de escrita
        //elemento1 + elemento2 + elemento3 + ... + elementoN
        System.out.println("RESULTADO = " + b + " METROS");

        //para limitar o número de casas:
        System.out.printf("RESULTADO = %.2f METROS%n", b);

        //supondo que haja outra variável:
        double  c = 23.974321;
        System.out.printf("RESULTADOS = %.2f METROS E %.2f METROS%n", b, c);

        //tipos de format:
        //%f = ponto flutuante ( decimais )
        //%s = string
        //%d= inteiros
        //%n = quebra de linha

        String nome = "Maria";
        int idade = 21;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        //para eu usar dois números de categorais diferentes, é necessário colocar o nome da diferente entre parenteses
        //vale lembrar que a parte decimal será perdida, isso é o CASTING
        double d;
        int e;

        d = 5.5;
        e = (int) d;
        System.out.println(d);
        System.out.println(e);

    }
}
