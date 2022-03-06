import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        // EOF: leitura até o final do arquivo (casos de teste)

        String nome = "C://Users//elisa//Documents//Dev//JavaProjects//BC - Christmas decoration//teste.txt";
        try{
            System.setIn(new FileInputStream(new File(nome)));
        }
        catch (FileNotFoundException e ){
            System.out.println("Arquivo não ecnotrado!");
        }

        Scanner scan = new Scanner(System.in);

        Double A, B, C, altura_arvore, tamanho_cordao, pi = 3.141592654, tangente;

        
        while(scan.hasNext()){
            // sendo A - angulo calculado pelo teodolito, B - distância teodolito<>arvore (cateto adj) e C - altura do elfo
            // tangente = cateto oposto / cateto adj
            A = scan.nextDouble();
            B = scan.nextDouble();
            C = scan.nextDouble();
   
            A = A*pi/180; //transformando A em radianos
            tangente = Math.tan(A);
    
            altura_arvore = (tangente * B) + C;
            tamanho_cordao = altura_arvore * 5;
            
            System.out.printf("%.2f",tamanho_cordao);
            System.out.println();  
        }

    }
}
