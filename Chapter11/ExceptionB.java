//Q11-16-Q11-17
package JavaHowToProgram.Chapter11;

public class ExceptionB extends ExceptionA{
    public ExceptionB(String s){
        super(s);
    }
    public ExceptionB(String s, Throwable throwable){
        super(s, throwable);

    }

    public ExceptionB(){}

    public ExceptionB(Throwable throwable){
        super(throwable);
    }

}
