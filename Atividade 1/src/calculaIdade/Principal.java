package calculaIdade;

public class Principal
{
	public static void main(String[] args)
	{
		Pessoa romario = new Pessoa();
		romario.setNome("Romario");
		romario.setAnoNasc(1966);
		
		romario.calculaIdade(2014);
		
		System.out.println(romario.getNome() + " nasceu em " + romario.getAnoNasc() + " e tem " + romario.getIdade() + " anos de idade.");
	}
}
