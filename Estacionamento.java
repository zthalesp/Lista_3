import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de veículos no estacionamento: ");
        int totalVeiculos = scanner.nextInt();

        System.out.print("Digite o total de rodas no estacionamento: ");
        int totalRodas = scanner.nextInt();

        int carros = (totalRodas - 2 * totalVeiculos) / 2;
        int motos = totalVeiculos - carros;

        if (carros >= 0 && motos >= 0 && (4 * carros + 2 * motos) == totalRodas) {
            System.out.println("\n--- Resultado ---");
            System.out.println("Carros no estacionamento: " + carros);
            System.out.println("Motos no estacionamento: " + motos);
        } else {
            System.out.println("\nOs dados informados não correspondem a uma combinação válida de carros e motos.");
        }

        scanner.close();
    }
}