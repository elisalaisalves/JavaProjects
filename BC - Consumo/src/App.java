import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); // distancia total percorrida (em Km)
        double y = scan.nextDouble(); // total de combustível gasto

        double consumo = (x/y); //consumo médio
        System.out.printf("%.3f %s", consumo,"km/l");
        System.out.println("");
    }
}
