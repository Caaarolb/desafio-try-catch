import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Dividir dois números");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarDivisao(scanner);
                    break;
                case 2:
                    showExitMessage();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }

    // Método para realizar a divisão com tratamento de exceção
    public static void realizarDivisao(Scanner scanner) {
        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número (divisor): ");
            double numero2 = scanner.nextDouble();

            // Verifica se o divisor é zero
            if (numero2 == 0) {
                System.out.println("Erro: Não é possível dividir por zero.");
            } else {
                double resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            }

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números válidos.");
            scanner.nextLine(); // Limpa o buffer do scanner
        }
    }

    // Método para exibir a mensagem de saída
    public static void showExitMessage() {
        System.out.println("\n" + "=".repeat(22) + " 💊 Programa encerrado! 💊 " + "=".repeat(20));
        System.out.println("Desenvolvido por: Jeisa Boaventura");
        System.out.println("GitHub: https://github.com/Caaarolb");
        System.out.println("LinkedIn: https://www.linkedin.com/in/-caroline-boaventura/");
        System.out.println("=" + "=".repeat(68) + "\n");
    }
}
