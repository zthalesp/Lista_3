import java.util.Scanner;
import java.lang.Math;

public class CalculadoraLogaritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número (argumento do logaritmo): ");
        double numero = scanner.nextDouble();
        
        System.out.print("Digite a base do logaritmo: ");
        double base = scanner.nextDouble();

        double logaritmo = Math.log(numero) / Math.log(base);

        System.out.printf("O logaritmo de %.2f na base %.2f é: %.4f%n", numero, base, logaritmo);

        scanner.close();
    }
}