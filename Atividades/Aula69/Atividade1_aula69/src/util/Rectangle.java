package util;

public class Rectangle {
    public double width;
    public double height;

    public double area (double width, double height){
        return width * height;

    }

    public double perimeter(double width, double height){
        return (2 * height) + (2 * width);

    }

    public double diagonal (double width, double height){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

    }

}
