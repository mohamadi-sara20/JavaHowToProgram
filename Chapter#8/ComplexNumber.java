package ir.phgnight;
//Create a class called Complex for performing arithmetic with complex
//numbers. Complex numbers have the form
//realPart + imaginaryPart * i
//where i is sqrt(-1)
//Write a program to test your class. Use floating-point variables to represent the private data of the
//class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
//Provide a no-argument constructor with default values in case no initializers are provided. Provide
//public methods that perform the following operations:
//a) Add two Complex numbers: The real parts are added together and the imaginary parts
//are added together.
//b) Subtract two Complex numbers: The real part of the right operand is subtracted from
//the real part of the left operand, and the imaginary part of the right operand is subtracted
//from the imaginary part of the left operand.
//c) Print Complex numbers in the form (realPart, imaginaryPart).

public class ComplexNumber {
    private int real;
    private int imaginary;

    public static void main(String[] args){

        ComplexNumber obj1 = new ComplexNumber(1, 9);
        ComplexNumber obj2 = new ComplexNumber(4, 6);
        System.out.print(obj1.toString(obj1.add(obj2)));
    }

    public ComplexNumber(){
        real = 0;
        imaginary = 0;

    }

    public ComplexNumber(int a, int b){
        real = a;
        imaginary = b;
    }

    private ComplexNumber add(ComplexNumber obj1){
        ComplexNumber res = new ComplexNumber();
        res.real = this.real + obj1.real;
        res.imaginary = this.imaginary + obj1.imaginary;
        return res;
    }

    private ComplexNumber subtract(ComplexNumber obj1){
        ComplexNumber res = new ComplexNumber();
        res.real = this.real - obj1.real;
        res.imaginary = this.imaginary - obj1.imaginary;
        return res;
    }

    public String toString(ComplexNumber obj1){
        return String.format("%d + %di", obj1.real, obj1.imaginary);
    }


}
