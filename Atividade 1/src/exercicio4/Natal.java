package exercicio4;

public class Natal extends CartaoWeb
{
	public Natal(String destinatario)
	{
		super(destinatario);
	}
	
	@Override
	public void message()
	{
		System.out.println(super.getDestinatario() + ","
				+ "\n   A Melhor mensagem de Natal � aquela que sai em sil�ncio de nossos"
				+ "\ncora��es e aquece com ternura os cora��es daqueles que nos acompanham"
				+ "\nem nossa caminhada pela vida."
				+ "\n\n   Feliz Natal!"
				+ "\n-----------------------------------------------------------------------------"
				+ "\n\n");
	}
}
