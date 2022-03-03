import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        Double volume,pi=3.14159;

        Double raio = scan.nextDouble();

        volume = (4/3.0) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();

    }
}
