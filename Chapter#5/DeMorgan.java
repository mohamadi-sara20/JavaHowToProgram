package ir.phgnight;

public class DeMorgan {
    public static void main(String[] args) {
        int x, y, a, b, g, i, j;
        a = 1;
        b = 2;
        x = 3;
        y = 4;
        g = 5;
        i = 6;
        j = 7;
    System.out.printf("%b    %b%n", !(x < 5) && !(y >= 7), !((x<5)||(y>=7)));
    System.out.printf("%b   %b%n", !(a == b) || !(g != 5), !((a==b)&&(g!=5)));
    System.out.printf("%b   %b%n", !((x <= 8) && (y > 4)), !(x<=8) || !(y>4));
    System.out.printf("%b   %b%n",!((i > 4) || (j <= 6)), !(i>4) && !(j<=6));

    }}