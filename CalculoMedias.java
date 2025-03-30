import java.util.Scanner;

public class CalculoMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três valores numéricos:");
        System.out.print("Primeiro valor: ");
        double a = scanner.nextDouble();
        
        System.out.print("Segundo valor: ");
        double b = scanner.nextDouble();
        
        System.out.print("Terceiro valor: ");
        double c = scanner.nextDouble();
        
        double mediaAritmetica = (a + b + c) / 3;
        double mediaHarmonica = 3 / ((1/a) + (1/b) + (1/c));
        double mediaGeometrica = Math.pow(a * b * c, 1.0/3);
        
        System.out.println("\nResultados:");
        System.out.printf("Média Aritmética: %.4f%n", mediaAritmetica);
        System.out.printf("Média Harmônica: %.4f%n", mediaHarmonica);
        System.out.printf("Média Geométrica: %.4f%n", mediaGeometrica);
        
        scanner.close();
    }
}