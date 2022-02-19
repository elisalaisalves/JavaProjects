import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declara as variáveis
        int A;
        int B;
        int PROD;

        // Cria um scanner
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("");
        A = scanner.nextInt();

        System.out.print("");
        B = scanner.nextInt();

        PROD = A*B;

        System.out.print("PROD = " + PROD);
        //Final de linha no java
        System.out.println();
    }
}
