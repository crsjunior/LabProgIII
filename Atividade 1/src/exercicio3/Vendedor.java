package exercicio3;

public class Vendedor extends Funcionario
{
	private float comissao;
	private double valor_vendas;
	
	public Vendedor(String nome, String matricula, double salario_base, float comissao)
	{
		super(nome, matricula, salario_base, "Vendedor");
		this.comissao = comissao;
		this.valor_vendas = 0.0;
	}
	
	public double getValor_vendas()
	{
		return this.valor_vendas;
	}
	
	public void novaVenda(double valor)
	{
		this.valor_vendas += valor;
	}
	
	@Override
	public double calculaSalario()
	{
		return super.getSalario_base() + (this.valor_vendas * this.comissao / 100.0);
	}
}
