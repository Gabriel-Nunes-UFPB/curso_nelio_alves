package util;

public class Triangle {
    public double a;
    public double b;
    public  double c;
    //Dessa forma é possível com que apenas três variáveis na classe triângulo substiuram a criação de 6 variáveis no main.

    public double area(){
        double p, area;
        p = (a + b + c)/2;
        area = Math.sqrt(p * (p-a) * (p-b) * (p-c));

        return area;
    }

}
