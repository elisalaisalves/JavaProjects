import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner (System.in);
        Double A= scan.nextDouble(),B = scan.nextDouble(),C = scan.nextDouble();
        Double a_triangulo, a_circulo, a_trapezio, a_quadrado, a_retangulo, pi=3.14159;

        a_triangulo = (A * C)/2; // base * altura / 2;
        a_circulo = Math.pow(C,2) * pi; // pi * raio^2
        a_trapezio = ((A+B) * C)/2; // base menor + base maior * altura / 2
        a_quadrado = B*B; // lado * lado
        a_retangulo = A * B; // lado maior * lado menor


        System.out.println(String.format("TRIANGULO: %.3f", a_triangulo));
        System.out.println(String.format("CIRCULO: %.3f", a_circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", a_trapezio));
        System.out.println(String.format("QUADRADO: %.3f", a_quadrado));
        System.out.println(String.format("RETANGULO: %.3f", a_retangulo));
        //System.out.println();
    }
}
