import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int cod1 = scan.nextInt();
        int quant1=scan.nextInt();
        Double valor1=scan.nextDouble();


        int cod2 = scan.nextInt();
        int quant2=scan.nextInt();
        Double valor2=scan.nextDouble();

        Double valorpagar = (quant1*valor1)+(quant2*valor2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorpagar);
        System.out.println();
    }
}
