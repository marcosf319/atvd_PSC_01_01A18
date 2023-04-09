import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double metros, lata, preco, latas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digete a quantidade de mestros a ser pintado");
        metros = teclado.nextDouble();
        lata = (metros / 3) / 18;
        latas = Math.ceil(lata);
        preco = latas * 80;
        System.out.println("precisara de " + latas + " lata(s)");
        System.out.println("tudo custará R$ " + preco);
        teclado.close();

    }
}
