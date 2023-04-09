import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double celsius, fahrenheit;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digete a temperatura em graus celsius:");
        celsius = teclado.nextDouble();
        fahrenheit = ((celsius * 1.8) + 32);
        System.out.println(fahrenheit + " Fahrenheit");
        teclado.close();
    }
}
