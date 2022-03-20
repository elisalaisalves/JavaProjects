import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorab, maiorabc;

        maiorab = (a+b+Math.abs(a-b))/2;
        maiorabc = (maiorab+c+Math.abs(maiorab-c))/2;
        
        System.out.println(maiorabc +  " eh o maior");
        System.out.println("");

    }
}
