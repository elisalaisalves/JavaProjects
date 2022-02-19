import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declara as variáveis
        int A,B,C,D,DIFERENCA;
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        A = scanner.nextInt();

        System.out.print("");
        B = scanner.nextInt();

        System.out.print("");
        C = scanner.nextInt();

        System.out.print("");
        D = scanner.nextInt();

        DIFERENCA = (A*B-C*D);

        // printf método que pode ser utilizado para imprimir strings em um formato específico
        System.out.printf("DIFERENCA = " + DIFERENCA);
        System.out.println();
    }
}
