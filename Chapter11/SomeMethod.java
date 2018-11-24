//(Rethrowing Exceptions) Write a program that illustrates rethrowing an exception. Define
//methods someMethod and someMethod2 . Method someMethod2 should initially throw an exception.
//Method someMethod should call someMethod2 , catch the exception and rethrow it. Call someMethod
//from method main , and catch the rethrown exception. Print the stack trace of this exception

package JavaHowToProgram.Chapter11;

public class SomeMethod {
    public static void main(String[] args){
        try {
            someMethod();
        }
        catch (Exception e){
            System.out.println("Handled in main!");

        }


    }


    public static void someMethod() throws Exception{
        try{
            someMethod2();
        }
        catch (Exception e){
            System.out.println("Exception handled and thrown again!");
            throw e;
        }
    }


    public static void someMethod2()
    throws Exception{
        throw new Exception("Thrown!");
    }

}
