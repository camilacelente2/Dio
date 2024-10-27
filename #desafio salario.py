def calcular_salario_transferido(valor_bruto, adicional_beneficios):
    # Calcula a alíquota de imposto com base no valor bruto do salário
    percentual_imposto = calcular_imposto(valor_bruto)
    # Calcula o valor do imposto a ser descontado
    imposto = valor_bruto * percentual_imposto
    # Calcula o salário final a ser transferido
    return (valor_bruto - imposto) + adicional_beneficios

def calcular_imposto(valor_bruto):
    # Define a alíquota de imposto com base nas faixas salariais
    if valor_bruto <= 1100.00:
        return 0.05  # 5%
    elif valor_bruto <= 2500.00:
        return 0.10  # 10%
    else:
        return 0.15  # 15%

def main():
    # Recebe o valor bruto e o adicional de benefícios como entrada do usuário
    try:
        valor_bruto = float(input("Digite o valor bruto do salário: R$ "))
        adicional_beneficios = float(input("Digite o valor do adicional dos benefícios: R$ "))
        
        # Calcula o salário a ser transferido
        salario_transferido = calcular_salario_transferido(valor_bruto, adicional_beneficios)
        
        # Exibe o salário transferido formatado para 2 casas decimais
        print(f"O salário a ser transferido é: R$ {salario_transferido:.2f}")
    
    except ValueError:
        print("Erro: Insira valores numéricos válidos para o salário e os benefícios.")

# Executa o programa
if __name__ == "__main__":
    main()


