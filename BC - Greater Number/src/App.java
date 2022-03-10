import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorab, maior;

        maiorab = (a+b+Math.abs(a-b))/2;
        if(maiorab == a){
            maior = (a+c+Math.abs(a-c))/2;
            System.out.println(maior + " eh o maior");
        }
        else{
            maior = (b+c+Math.abs(b-c))/2;
            System.out.println(maior + " eh o maior");
        }
        System.out.println("");

    }
}
