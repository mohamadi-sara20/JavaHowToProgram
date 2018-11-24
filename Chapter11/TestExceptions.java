//Use inheritance to create an exception superclass
//(called ExceptionA ) and exception subclasses ExceptionB and ExceptionC , where ExceptionB inher-
//its from ExceptionA and ExceptionC inherits from ExceptionB . Write a program to demonstrate
//that the catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC .


package JavaHowToProgram.Chapter11;

public class TestExceptions {

    public static void main(String[] args){
        int a = -1;
        int  b = -0;
        try{
            throw new ExceptionC();
        }

        catch (ExceptionA e){

            System.out.println("Exception A thrown!");

        }

        try{

            throw new ExceptionB();
        }
        catch (ExceptionA e){

            System.out.println("Exception A thrown!");

        }



    }


    }

