import java.util.Scanner;

public class CalculoSalarioBruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora de trabalho: R$ ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite o valor do salário família por filho: R$ ");
        double salarioFamiliaPorFilho = scanner.nextDouble();

        System.out.print("Digite o número de filhos menores de 14 anos: ");
        int numeroFilhos = scanner.nextInt();

        double salarioHora = horasTrabalhadas * valorPorHora;
        double totalSalarioFamilia = numeroFilhos * salarioFamiliaPorFilho;
        double salarioBruto = salarioHora + totalSalarioFamilia;

        System.out.println("\n--- Demonstrativo de Salário Bruto ---");
        System.out.printf("Salário por horas trabalhadas (%.1f h × R$ %.2f): R$ %.2f%n",
                          horasTrabalhadas, valorPorHora, salarioHora);
        System.out.printf("Salário família (%d filhos × R$ %.2f): R$ %.2f%n",
                          numeroFilhos, salarioFamiliaPorFilho, totalSalarioFamilia);
        System.out.printf("SALÁRIO BRUTO TOTAL: R$ %.2f%n", salarioBruto);

        scanner.close();
    }
}