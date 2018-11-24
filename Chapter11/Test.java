//(Catching Exceptions Using Class Exception ) Write a program that demonstrates how var-
//ious exceptions are caught with
//catch (Exception exception)
//This time, define classes ExceptionA (which inherits from class Exception ) and ExceptionB (which
//inherits from class ExceptionA ). In your program, create try blocks that throw exceptions of types
//ExceptionA , ExceptionB , NullPointerException and IOException . All exceptions should be
//caught with catch blocks specifying type Exception .


package JavaHowToProgram.Chapter11;

import java.io.IOException;

public class Test {

    public  static void main(String[] args){

        try{
            throw new ExceptionB();

        }
        catch (Exception e){

            System.out.println("Exception B handled!");

        }


        try {
            throw new ExceptionA();
        }

        catch (Exception e){
            System.out.println("Exception A handled!");
        }


        try {
            throw new NullPointerException();
        }
        catch (Exception e){

            System.out.println("NullPointerException handled!");
        }

        try
        {
            throw new IOException();
        }
        catch (Exception e){

            System.out.println("IOException handled!");

        }


    }


}
