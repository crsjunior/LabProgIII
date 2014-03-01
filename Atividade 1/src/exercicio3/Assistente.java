package exercicio3;

public class Assistente extends Funcionario
{
	public Assistente(String nome, String matricula, double salario_base)
	{
		super(nome, matricula, salario_base, "Assistente");
	}
	
	@Override
	public double calculaSalario()
	{
		return super.getSalario_base();
	}
}
