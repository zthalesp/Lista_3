import java.util.Scanner;

public class AumentoPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double precoOriginal = scanner.nextDouble();

        double aumento = precoOriginal * 0.10;
        double novoPreco = precoOriginal + aumento;

        System.out.printf("Novo valor do produto: %.2f%n", novoPreco);

        scanner.close();
    }
}