import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double metros, centimetros;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digete a quantidade de mestros a ser convertida:");
        metros = teclado.nextDouble();
        centimetros = metros * 100;
        System.out.println(centimetros + " centimetros");
        teclado.close();

    }
}
