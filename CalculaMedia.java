import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = (numero1 + numero2) / 2;

        System.out.println("A média entre " + numero1 + " e " + numero2 + " é: " + media);

        scanner.close();
    }
}