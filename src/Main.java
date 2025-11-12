import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários deseja cadastrar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha

        for (int i = 0; i < n; i++) {
            System.out.println("\nFuncionário " + (i + 1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o cargo (Desenvolvedor/Gerente/Estagiario): ");
            String cargo = scanner.nextLine().trim();

            System.out.print("Digite o salário base: ");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine(); // consumir a quebra de linha

            switch (cargo.toLowerCase()) {
                case "desenvolvedor":
                    System.out.print("Digite a quantidade de projetos: ");
                    int quantidadeProjetos = scanner.nextInt();
                    scanner.nextLine(); // consumir a quebra de linha
                    funcionarios.add(new Desenvolvedor(nome, salarioBase, quantidadeProjetos));
                    break;

                case "gerente":
                    System.out.print("Digite o bônus: ");
                    double bonus = scanner.nextDouble();
                    scanner.nextLine(); // consumir a quebra de linha
                    funcionarios.add(new Gerente(nome, salarioBase, bonus));
                    break;

                case "estagiario":
                    funcionarios.add(new Estagiario(nome, salarioBase));
                    break;

                default:
                    System.out.println("Cargo inválido! Funcionário não cadastrado.");
                    i--; // repetir cadastro para este índice
                    break;
            }
        }

        System.out.println("\n=== Salários Calculados ===");
        for (Funcionarios f : funcionarios) {
            f.calcularSalario(); // polimorfismo
            String cargo = f.getClass().getSimpleName();
            System.out.printf("Nome: %s - Cargo: %s - Salário: R$ %.2f%n", f.getNome(), cargo, f.getSalarioFinal());
        }

        scanner.close();
    }
}
