package JavaHowToProgram.Chapter18;

public class five {


    public static void main(String[] args) {
        System.out.println(aaaadddd(1));
    }

    public static int add(int a) {
        if(a == 1)
            return 1;
        else
            return 1 - add(a -1);
    }

    public static int aaaadddd(int a){
        if(a == 5)
            return 5;
        else
            return aaaadddd(a + 1);
    }

}






