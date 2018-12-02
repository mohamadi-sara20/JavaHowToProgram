package JavaHowToProgram.Chapter14;



public class IntToChar {

    public static void main(String[] args){


        System.out.println(intToCharConverter(1));
        System.out.println(intToCharConverter(65));
    }


    public static char intToCharConverter(int digit){
        return Character.forDigit(digit, 8);


    }

}

