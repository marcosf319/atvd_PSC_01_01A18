import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double peso, link, tempo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tamanho do dawnload em MB:");
        peso = teclado.nextDouble();
        System.out.println("informe a velocidade de sua internet em mbps:");
        link = teclado.nextDouble();

        tempo = (peso / link) / 60;
        System.out.println(tempo + " minutos");
        teclado.close();
    }
}
