import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Declara as variáveis
        double A;
        double B;
        double MEDIA;
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        A = scanner.nextDouble();

        System.out.print("");
        B = scanner.nextDouble();

        MEDIA = ((A*3.5)+(B*7.5))/11;

        // printf método que pode ser utilizado para imprimir strings em um formato específico
        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.println();

    }
}
