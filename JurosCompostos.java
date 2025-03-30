import java.util.Scanner;
import java.lang.Math;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital aplicado (R$): ");
        double capital = scanner.nextDouble();

        System.out.print("Digite o prazo da aplicação (meses): ");
        int meses = scanner.nextInt();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaPercentual = scanner.nextDouble();
        double taxaDecimal = taxaPercentual / 100; 

        double montante = capital * Math.pow(1 + taxaDecimal, meses);

        System.out.printf("\nCapital Inicial (C): R$ %.2f%n", capital);
        System.out.printf("Taxa de Juros (i): %.2f%% ao mês%n", taxaPercentual);
        System.out.printf("Prazo (n): %d meses%n", meses);
        System.out.printf("Montante Final (M): R$ %.2f%n", montante);

        scanner.close();
    }
}