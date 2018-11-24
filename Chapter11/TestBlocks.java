package JavaHowToProgram.Chapter11;

public class TestBlocks {

    public static void main(String[] args){
        try {
            method2(true);
            method2(false);
        }
        catch (ExceptionA e){
            System.out.println("Exception A handled!");
        }


    }

    public static void method2(boolean f)throws ExceptionA{
        try{
            if (f)
            method1();
            else {
                int a = 9;
                int b = 0;
                a = a / b;
            }

        }
        catch (ArithmeticException e){
            System.out.println("handled division by zero!");
        }

    }


    public static void method1() throws ExceptionA{
        throw new ExceptionA("Thrown!");
    }


}
