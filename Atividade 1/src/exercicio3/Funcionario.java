package exercicio3;

abstract class Funcionario
{
	private String nome;
	private String matricula;
	private double salario_base;
	private String cargo;
	
	public Funcionario(String nome, String matricula, double salario_base, String cargo)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
		this.cargo = cargo;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getMatricula()
	{
		return matricula;
	}
	
	public double getSalario_base()
	{
		return salario_base;
	}
	
	public String getCargo()
	{
		return cargo;
	}
	
	abstract double calculaSalario();
}
