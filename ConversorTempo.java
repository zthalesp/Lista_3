import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de segundos: ");
        int segundosTotais = scanner.nextInt();
        
        int horas = segundosTotais / 3600; 
        int segundosRestantes = segundosTotais % 3600;
        int minutos = segundosRestantes / 60; 
        int segundos = segundosRestantes % 60;
        
        System.out.printf("\n%d segundos equivalem a:%n", segundosTotais);
        System.out.printf("%d horas, %d minutos e %d segundos%n", horas, minutos, segundos);
        
        scanner.close();
    }
}