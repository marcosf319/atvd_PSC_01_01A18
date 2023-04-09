import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double salariohora, horas, salariomes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe quando você ganha por hora: ");
        salariohora = teclado.nextDouble();
        System.out.print("Informe qunatas horas você trabalha por mês: ");
        horas = teclado.nextDouble();
        salariomes = (salariohora * horas);
        System.out.println("Salario mensal: " + salariomes);
        teclado.close();
    }
}
