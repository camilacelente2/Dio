import java.util.Scanner;

public class CalculoSalario {
    
    // Método para calcular o salário a ser transferido
    public static double calcularSalarioTransferido(double valorBruto, double adicionalBeneficios) {
        double percentualImposto = calcularImposto(valorBruto);
        double imposto = valorBruto * percentualImposto;
        return (valorBruto - imposto) + adicionalBeneficios;
    }

    // Método para calcular a alíquota de imposto com base no valor bruto
    public static double calcularImposto(double valorBruto) {
        if (valorBruto <= 1100.00) {
            return 0.05; // 5%
        } else if (valorBruto <= 2500.00) {
            return 0.10; // 10%
        } else {
            return 0.15; // 15%
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o valor bruto do salário e o adicional dos benefícios
        System.out.print("Digite o valor bruto do salário: R$ ");
        double valorBruto = scanner.nextDouble();

        System.out.print("Digite o valor do adicional dos benefícios: R$ ");
        double adicionalBeneficios = scanner.nextDouble();

        // Calcula o salário a ser transferido
        double salarioTransferido = calcularSalarioTransferido(valorBruto, adicionalBeneficios);

        // Exibe o salário a ser transferido, formatado com duas casas decimais
        System.out.printf("O salário a ser transferido é: R$ %.2f%n", salarioTransferido);

        scanner.close();
    }
}


