import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double lado, area, dobro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho de um dos lado do quadrado");
        lado = teclado.nextDouble();
        teclado.close();
        area = Math.pow(lado, 2);
        dobro = (area * 2);
        System.out.println("area =" + area);
        System.out.println("o dobro da área é " + dobro);

    }
}
