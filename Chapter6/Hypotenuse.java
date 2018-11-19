package ir.phgnight;

public class Hypotenuse {
    private static double s1, s2;
    private static int[] test_sides = {3, 4, 5, 12, 8, 15};
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i += 2){
            s1 = test_sides[i];
            s2 = test_sides[i+1];

            System.out.printf("The hypotenuse for %.2f and %.2f sides would be %.2f. %n", s1, s2, hypotenuse(s1, s2));}
    }

    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));}
}
