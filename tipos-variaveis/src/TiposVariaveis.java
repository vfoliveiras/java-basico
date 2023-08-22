import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulador de Calculadora");
        System.out.println("Operações disponíveis:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Escolha a operação (1/2/3/4): ");
        int operation = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    extracted();
                }
                break;
            default:
                System.out.println("Operação inválida.");
                extracted();
        }

        System.out.println("Resultado: " + result);

        scanner.close();
    }

    private static void extracted() {
    }
}
