// Função para calcular o salário transferido
function calcularSalarioTransferido(valorBruto, adicionalBeneficios) {
    const percentualImposto = calcularImposto(valorBruto);
    const imposto = valorBruto * percentualImposto;
    return (valorBruto - imposto) + adicionalBeneficios;
}

// Função para calcular a alíquota de imposto com base no valor bruto
function calcularImposto(valorBruto) {
    if (valorBruto <= 1100.00) {
        return 0.05; // 5%
    } else if (valorBruto <= 2500.00) {
        return 0.10; // 10%
    } else {
        return 0.15; // 15%
    }
}

// Função principal para receber valores e exibir o resultado
function main() 
