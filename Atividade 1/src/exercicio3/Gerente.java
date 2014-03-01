package exercicio3;

public class Gerente extends Funcionario
{
	public Gerente(String nome, String matricula, double salario_base)
	{
		super(nome, matricula, salario_base, "Gerente");
	}
	
	@Override
	public double calculaSalario()
	{
		return super.getSalario_base() * 2.0;
	}
}
