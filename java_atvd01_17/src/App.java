import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double metros, lata, precolata, latas, galoes, galao, precogalao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digete a quantidade de mestros a ser pintado");
        metros = teclado.nextDouble();
        lata = (metros / 6) / 18;
        galoes = (metros / 6) / 3.6;
        latas = Math.ceil(lata);
        galao = Math.ceil(galoes);
        precolata = latas * 80;
        precogalao = galao * 25;
        System.out.println("precisara de " + latas + " lata(s)");
        System.out.println("se for comprado tudo por latas custará R$ " + precolata);
        System.out.println("Em galões gastara " + galao + " unidade(s)");
        System.out.println("se for comprado tudo em galões custará R$" + precogalao);
        teclado.close();
        // não tenho ideia de como resolver a letra C //

    }
}
