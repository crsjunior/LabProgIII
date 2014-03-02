package exercicio4;

public class Aniversario extends CartaoWeb
{
	public Aniversario(String destinatario)
	{
		super(destinatario);
	}
	
	@Override
	public void message()
	{
		System.out.println(super.getDestinatario() + ","
				+ "\n   Amizade não é algo que está escrito em um papel, pois o papel pode"
				+ "\nser rasgado. Também não é algo que pode ser escrito em uma pedra, pois"
				+ "\nmesmo uma pedra pode quebrar. Mas está escrito no coração de uma pessoa,"
				+ "\ne ela fica lá para sempre. Desejo muitas bênçãos em sua vida."
				+ "\n\n   Feliz Aniversário!"
				+ "\n-----------------------------------------------------------------------------"
				+ "\n\n");
	}
}
