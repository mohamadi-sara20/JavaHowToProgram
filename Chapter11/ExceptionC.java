//Q11-16
package JavaHowToProgram.Chapter11;

public class ExceptionC extends ExceptionB{
    public ExceptionC(String s){
        super(s);
    }
    public ExceptionC(String s, Throwable throwable){
        super(s, throwable);

    }

    public ExceptionC(){}

    public ExceptionC(Throwable throwable){
        super(throwable);
    }


}
