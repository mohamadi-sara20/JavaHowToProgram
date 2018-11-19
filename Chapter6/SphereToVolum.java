package ir.phgnight;
import java.util.Scanner;
public class SphereToVolum {
    public static double radius;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius!");
        radius = input.nextDouble();

        System.out.printf("Volume: %f%n", sphereToVolume(radius));

    }

    public static double sphereToVolume(double radius){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
     return volume;}


}
