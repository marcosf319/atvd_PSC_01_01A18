import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float fahrenheit, celsius;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digete a temperatura em Fahrenheit: ");
        fahrenheit = teclado.nextFloat();
        celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.println("Após coverter a temperatura para celsius chegamos a esse resultado:" + celsius);
        teclado.close();

    }
}
