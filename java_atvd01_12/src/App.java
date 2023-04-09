import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double altura, pesoideal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        altura = teclado.nextDouble();
        pesoideal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é; " + pesoideal);
        teclado.close();

    }
}
