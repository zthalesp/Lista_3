import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em °F (Fahrenheit): ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("%.2f°F equivalem a %.2f°C%n", fahrenheit, celsius);

        scanner.close();
    }
}