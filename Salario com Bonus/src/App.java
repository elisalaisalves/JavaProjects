import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeVendedor;
        double salarioFixo, totalVendas, salarioBonus;

        Scanner scan = new Scanner(System.in);

        System.out.println("");
        nomeVendedor = scan.nextLine();

        System.out.println("");
        salarioFixo = scan.nextDouble();

        System.out.println("");
        totalVendas = scan.nextDouble();

        salarioBonus = salarioFixo + (totalVendas*0.15);
        System.out.printf("TOTAL = R$ %.2f",salarioBonus);
        System.out.println("");

    }
}
