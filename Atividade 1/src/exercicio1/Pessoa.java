package exercicio1;

public class Pessoa
{
	private String nome;
	private int anoNasc;
	private int idade;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public int getAnoNasc()
	{
		return anoNasc;
	}
	
	public void setAnoNasc(int anoNasc)
	{
		this.anoNasc = anoNasc;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public void calculaIdade(int anoAtual)
	{
		this.idade = anoAtual - anoNasc;
	}
}
