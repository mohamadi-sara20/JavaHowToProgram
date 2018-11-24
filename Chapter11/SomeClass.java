//Write a program that shows a constructor passing information about
//constructor failure to an exception handler. Define class SomeClass , which throws an Exception in
//the constructor. Your program should try to create an object of type SomeClass and catch the ex-
//ception that’s thrown from the constructor.


package JavaHowToProgram.Chapter11;

public class SomeClass {
    public SomeClass()
    throws Exception{
        throw new Exception("exception");
    }

    public static void main(String[] args)
    {
        try {

        SomeClass a = new SomeClass();

    }
        catch (Exception e){
            System.out.println("Exception handled!");

        }
    }


}

