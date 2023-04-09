import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double salario, salarioliquido, IR, INSS, sindicato;
        double Sahora, hormes;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quanto você ganha por hora:");
        Sahora = teclado.nextDouble();
        System.out.println("Digite a quantidade de horas que você trabalha por mês:");
        hormes = teclado.nextDouble();
        salario = (Sahora * hormes);
        IR = (salario * 0.11);
        INSS = (salario * 0.08);
        sindicato = (salario * 0.05);
        salarioliquido = salario - (IR + INSS + sindicato);
        System.out.println("Salario bruto= R$ " + salario);
        System.out.println("você devera pagar R$ " + IR + " de imposto de renda");
        System.out.println("você devera pagar R$ " + INSS + " para o INSS");
        System.out.println("você devera pagar R$ " + sindicato + " para o sindicato");
        System.out.println("Salario liquido R$ " + salarioliquido);
        teclado.close();

    }
}
