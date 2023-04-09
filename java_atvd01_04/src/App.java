import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double med1, med2, med3, med4, media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digete a nota do primeiro bimestre: ");
        med1 = teclado.nextDouble();
        System.out.print("Digete a nota do segundo bimestre: ");
        med2 = teclado.nextDouble();
        System.out.print("Digete as notas do terceiro bimestre: ");
        med3 = teclado.nextDouble();
        System.out.print("Digete a nota do quarto bimestre: ");
        med4 = teclado.nextDouble();
        teclado.close();
        media = (med1 + med2 + med3 + med4) / 4;
        System.out.println("Sua nota final: " + media);

    }
}
