import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1, numero2, resultadoA;
        double numero3, resultadoB, resultadoC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        numero1 = teclado.nextInt();
        System.out.println("Digete o segundo numero inteiro:");
        numero2 = teclado.nextInt();
        System.out.println("Digete um numero real:");
        numero3 = teclado.nextDouble();
        resultadoA = ((numero1 * 2) + (numero2 / 2));
        resultadoB = ((numero1 * 3) + numero3);
        resultadoC = Math.pow(numero3, 3);
        System.out.println("A resposta da letra A é: " + resultadoA);
        System.out.println("A resposta da letra B é:" + resultadoB);
        System.out.println("A reposta da letra C é:" + resultadoC);
        teclado.close();

    }
}
