//(Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a
//string in the form (555) 555-5555. The application should use String method split to extract the
//area code as a token, the first three digits of the phone number as a token and the last four digits of
//the phone number as a token. The seven digits of the phone number should be concatenated into
//one string. Both the area code and the phone number should be printed. Remember that you’ll have
//to change delimiter characters during the tokenization process.


package JavaHowToProgram.Chapter14;
import java.util.Scanner;
public class TokenizePhoneNumbers {
    public static void main(String[] args){
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your phone number in this format: (code area) numbers-numbers");
        phone = input.nextLine();


        if (validatePhoneNumber(phone))
            System.out.printf("%s: %s%n%s: %s%n", "code area", phoneNumberTokenizer(phone)[0], "phone number", phoneNumberTokenizer(phone)[1].concat(phoneNumberTokenizer(phone)[2]));
        else
            System.out.println("Invalid number!");


    }



    public static String[] phoneNumberTokenizer(String phoneNumber){

        String phone1 = phoneNumber.replaceAll("[-+()]", " ");
        String phone3 = phone1.replaceAll(" +", " ");
        String phone4 = phone3.trim();

        String[] tokenizedNumber = new String[3];
        tokenizedNumber = phone4.split(" ");


        return tokenizedNumber;

    }

    public static boolean validatePhoneNumber(String phoneNumber){
        if(phoneNumber.matches("\\(\\d+\\)\\s\\d+-\\d+"))
            return true;
        else
            return false;
    }



}


