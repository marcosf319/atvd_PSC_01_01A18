import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double peso, multa;
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o peso dos peixes pescado");
        peso = teclado.nextDouble();
        multa = ((peso - 50) * 4);
        if (peso > 50) {
            System.out.println("você deve pagar R$" + multa + " de multa");
        } else if (peso < 50) {
            System.out.println("você está insento de multa");
            teclado.close();
        }

    }
}
