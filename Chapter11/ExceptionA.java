//Q11-16-Q11-17
package JavaHowToProgram.Chapter11;

public class ExceptionA extends Exception {
    public ExceptionA(String s){
        super(s);
    }

    public ExceptionA(){}

    public ExceptionA(String s, Throwable throwable){
        super(s, throwable);
    }

    public ExceptionA(Throwable throwable){
        super(throwable);
    }

}
