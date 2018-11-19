package ir.phgnight;
//Create a class Rectangle with attributes length and width, each of which
//defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//methods for both length and width. The set methods should verify that length and width are each
//floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

public class RectangleClass {
    private double length = 1.0;
    private double width = 1.0;


    public static void main(String[] args) {

        RectangleClass rec = new RectangleClass();

        double l = rec.getLength();
        double w = rec.getWidth();
        System.out.printf("Length: %f%nWidth: %f%nPerimeter: %f%nArea: %f%n", l, w, rec.getPerimeter(), rec.getArea());

        rec.setLength(4);
        rec.setWidth(9);
        l = rec.getLength();
        w = rec.getWidth();

        System.out.printf("After modification of lenght and width:%nLenght: %f%nWidth: %f%nPerimeter: %f%nArea: %f%n", l, w, rec.getPerimeter(), rec.getArea());

        try {
            rec.setLength(21.3);
        }
        catch (IllegalArgumentException error){
            System.out.printf("Exception: %s%n%n", error.getMessage());
        }

        try {
            rec.setWidth(21.3);
        }
        catch (IllegalArgumentException error){
            System.out.printf("Exception: %s%n%n", error.getMessage());
        }


        System.out.printf("After changing both sides to an invalid value:%nLenght: %f%nWidth: %f%nPerimeter: %f%nArea: %f%n", l, w, rec.getPerimeter(), rec.getArea());



    }

    public void setLength(double num){
        if(num > 0.0 && num < 20.0)
            length = num;
        else
            throw new IllegalArgumentException("Length out of acceptable range!");
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double num){
        if(num > 0.0 && num < 20.0)
            width = num;
        else
            throw new IllegalArgumentException("Width out of acceptable range!");
    }


    public double getWidth(){
        return width;
    }

    private double area(double length, double width){
        return length * width;
    }

    private double perimeter(double length, double width){
        return length * 2 + width * 2;
    }

    public double getPerimeter(){
        return perimeter(length * 2, width * 2);
    }

    public double getArea(){
        return area(length, width);
    }

}
