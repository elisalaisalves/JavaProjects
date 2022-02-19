import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declara as variáveis
        double A;
        double B;
        double C;
        double MEDIA;
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        A = scanner.nextDouble();

        System.out.print("");
        B = scanner.nextDouble();

        System.out.print("");
        C = scanner.nextDouble();

        MEDIA = ((A*2)+(B*3)+(C*5))/10;

        // printf método que pode ser utilizado para imprimir strings em um formato específico
        System.out.printf("MEDIA = %.1f", MEDIA);
        System.out.println();
    }
}
