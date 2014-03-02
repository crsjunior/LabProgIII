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
				+ "\n   Amizade n�o � algo que est� escrito em um papel, pois o papel pode"
				+ "\nser rasgado. Tamb�m n�o � algo que pode ser escrito em uma pedra, pois"
				+ "\nmesmo uma pedra pode quebrar. Mas est� escrito no cora��o de uma pessoa,"
				+ "\ne ela fica l� para sempre. Desejo muitas b�n��os em sua vida."
				+ "\n\n   Feliz Anivers�rio!"
				+ "\n-----------------------------------------------------------------------------"
				+ "\n\n");
	}
}
