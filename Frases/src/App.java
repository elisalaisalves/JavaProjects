public class App {
    public static void main(String[] args) throws Exception {
        String[] wordListOne={"24/7","várias camadas","30.000 pés","B-to-B","todos ganham","fron-end","baseado na Web","difundido","inteligente","seis sigma","caminho crítico","dinâmico"};
        String[] wordListTwo={"habilitado","adesivo","Valor agregado","orientado","central","distribuído","posicionado","em rede","dedicado"};
        String[] wordListThree={"processo","ponto máximo","solução","arquitetura","habilitação no núcleo","estratégia","mindshare","portal"};

        //qntas palavras existem em cada lista?
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //criando um número aleatório
        int rand1= (int)(Math.random()*oneLength);
        int rand2= (int)(Math.random()*twoLength);
        int rand3= (int)(Math.random()*threeLength);

        //criando a frase
        String frase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de "+frase);
    }
}
