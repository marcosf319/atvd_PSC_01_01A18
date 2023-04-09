import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double altura, psidealM, psidealF;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        altura = teclado.nextDouble();
        psidealM = (72.7 * altura) - 58;
        psidealF = (62.1 * altura) - 44.7;
        System.out.println("Para uma pessoa do sexo masculino com " + altura + "de altura o peso ideal é: " + psidealM);
        System.out.println("Para uma pessoa do sexo feminino com " + altura + "de altura o peso ideal é: " + psidealF);
        teclado.close();
    }
}
