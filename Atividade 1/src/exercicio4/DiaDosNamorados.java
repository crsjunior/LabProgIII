package exercicio4;

public class DiaDosNamorados extends CartaoWeb
{
	public DiaDosNamorados(String destinatario)
	{
		super(destinatario);
	}
	
	@Override
	public void message()
	{
		System.out.println(super.getDestinatario() + ","
				+ "\n   Hoje acordei pensando em voc�, acordei pensando em n�s dois, em tudo o que"
				+ "\naconteceu e acontece entre n�s. Levantei-me e tive uma certeza, cada dia tem"
				+ "\num significado dentro da vida. N�o � porque o sol nasceu radiante, nem t�o"
				+ "\npouco porque o vento sopra gostoso que o dia est� lindo. � porque tudo o que"
				+ "\nvejo e toco tem algo de voc�. Hoje � o dia dos namorados e acredito que j�"
				+ "\nestava combinado no infinito que estar�amos juntos, que nascemos mesmo para"
				+ "\nvivermos lado a lado compartilhando sonhos e alegrias. Nem mesmo o por do sol,"
				+ "\nnem o sorriso desse dia lindo se iguala a grandeza desse sentimento que sinto"
				+ "\npor voc�. Voc� � o meu tudo, sem a sua presen�a eu me perco, meu tudo vira"
				+ "\nnada, s� voc� me alimenta, me da prazer, todos os meus mais belos sonhos voc�"
				+ "\nfaz virar realidade. Que seja assim enquanto existir, farei de tudo para n�o"
				+ "\ndeixar o que sinto por voc� acabar e seguirei assim. Pois te querer bem e amar"
				+ "\nvoc� � uma doce maravilha."
				+ "\nParab�ns pelo dia de hoje meu amor e, para n�s, um sempre..."
				+ "\n\n   Feliz Dia dos Namorados!"
				+ "\n-----------------------------------------------------------------------------"
				+ "\n\n");
	}
}
