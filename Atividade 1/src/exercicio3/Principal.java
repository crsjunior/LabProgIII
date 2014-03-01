package exercicio3;

import java.util.ArrayList;

public class Principal
{
	public static void main(String[] args)
	{
		// Lista de funcionarios:
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		// Criando funcionarios:
		Gerente gerente = new Gerente("João", "0001/01", 4950.0);
		Assistente assistente = new Assistente("Pedro", "0001/02", 1250.0);
		Vendedor vendedor = new Vendedor("Manuel", "0001/03", 2230.0, 18.0f);
		
		// Adicionando os funcionarios a lista de funcionarios:
		funcionarios.add(gerente);
		funcionarios.add(assistente);
		funcionarios.add(vendedor);
		
		// Simulando vendas para o vendedor, sobre as quais ele recebera comissao:
		vendedor.novaVenda(230.0);
		vendedor.novaVenda(175.0);
		
		// Recebera a soma dos salarios de todos os funcionarios:
		double valorTotalFolhaSalarial = 0.0;
		for (Funcionario funcionario : funcionarios) {
			System.out.printf("Funcionário: %s\n  Matrícula: %s\n      Cargo: %s\n    Salário: R$ %.02f\n\n",
					funcionario.getNome(), funcionario.getMatricula(), funcionario.getCargo(), funcionario.calculaSalario());
			valorTotalFolhaSalarial += funcionario.calculaSalario();
		}
		System.out.println("-----------------------------------\n    RESUMO FOLHA DE PAGAMENTO\n-----------------------------------");
		System.out.printf("Qtd. funcionários: %05d\n      Valor total: R$ %.02f",
				funcionarios.size(), valorTotalFolhaSalarial);
	}
}
