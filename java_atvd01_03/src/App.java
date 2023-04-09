import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numero1, soma, numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:");
        numero1 = teclado.nextDouble();
        System.out.print("Digite o segundo numero:");
        numero2 = teclado.nextDouble();
        soma = (numero1 + numero2);
        System.out.println("a soma dos dois sumero é = " + soma);
        teclado.close();

    }
}
