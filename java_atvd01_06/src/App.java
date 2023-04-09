import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        raio = teclado.nextDouble();
        teclado.close();
        area = Math.PI * raio * raio;
        System.out.println("aréa = " + area);

    }
}
