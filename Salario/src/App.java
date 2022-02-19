import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("");
        numFuncionario = scanner.nextInt();

        System.out.print("");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("");
        valorHora = scanner.nextDouble();

        salario = valorHora * horasTrabalhadas;
        System.out.println("NUMBER = "+numFuncionario);
        System.out.printf("SALARY = U$ %.2f",salario);
        System.out.println("");
    }
}
