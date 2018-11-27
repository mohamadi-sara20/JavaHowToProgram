//Writing the Word Equivalent of a Check Amount) Continuing the discussion in
//Exercise 14.20, we reiterate the importance of designing check-writing systems to prevent alteration
//of check amounts. One common security method requires that the amount be written in numbers
//and spelled out in words as well. Even if someone is able to alter the numerical amount of the check,
//it’s extremely difficult to change the amount in words. Write an application that inputs a numeric
//check amount that’s less than $1000 and writes the word equivalent of the amount. For example,
//the amount 112.43 should be written as
//ONE hundred TWELVE and 43/100


package JavaHowToProgram.Chapter14;

public class WordEquivalent {
    public static String[] uniques = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninetheen"};
    public static String[] tenths = {null, "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static String hundreth = "hundred";

    public static void main(String[] args) {
        try {
            System.out.println(wordEquivalent(112.43));
            System.out.println(wordEquivalent(329.98));
            System.out.println(wordEquivalent(100.00));
            System.out.println(wordEquivalent(999.9999999999));
            System.out.println(wordEquivalent(99.99999999999));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Only up to ten floating points is allowed!");
        }


    }


    public static String wordEquivalent(double x) {
        String tenth;
        String numerator;
        String denominator;
        int decimal = (int) x;
        double fractional = (double) x - decimal;

        double h = decimal / 100;

        decimal = decimal % 100;

        if (decimal < 1)
            tenth = "  ";
        else if ((decimal < 20)) {
            tenth = uniques[decimal - 1];
            //System.out.println(tenth);
        } else {
            tenth = tenths[(decimal / 10) - 1] + " " + uniques[decimal % 10 - 1];
        }


        if (decimal > 0) {
            String fractionFormatted = Double.toString(fractional).substring(0, 11).replaceAll("0+$", "");
            numerator = fractionFormatted.replaceAll("0\\.", "");
        }
        else {
            numerator = "0";
            denominator = "0";
        }

        denominator = "1";
        for (int i = 0; i < numerator.length(); i++)
            denominator += "0";

        String fractionPart = numerator + "/" + denominator;

        return String.format("%s %s %s %s", uniques[(int) h - 1], hundreth, tenth, (decimal > 0) ? (fractional != 0.0 ? "and " + fractionPart : "") : "");
    }
}






