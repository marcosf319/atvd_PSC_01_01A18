import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("digete o numero a ser informado:");
        numero = teclado.nextDouble();
        System.out.println("o numero informado foi:" + numero);
        teclado.close();
    }
}
