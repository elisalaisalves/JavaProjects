public class App {
    public static void main(String[] args) throws Exception {
        int x = 1;
        System.out.println("Antes do loop");
        while (x<4){
            System.out.println("No loop");
            System.out.println("O valor de x é " + x);
            x = x +1;
        }
        System.out.println("Esse é o fim do loop!");
    }
}
