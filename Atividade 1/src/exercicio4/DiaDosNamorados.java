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
				+ "\n   Hoje acordei pensando em você, acordei pensando em nós dois, em tudo o que"
				+ "\naconteceu e acontece entre nós. Levantei-me e tive uma certeza, cada dia tem"
				+ "\num significado dentro da vida. Não é porque o sol nasceu radiante, nem tão"
				+ "\npouco porque o vento sopra gostoso que o dia está lindo. É porque tudo o que"
				+ "\nvejo e toco tem algo de você. Hoje é o dia dos namorados e acredito que já"
				+ "\nestava combinado no infinito que estaríamos juntos, que nascemos mesmo para"
				+ "\nvivermos lado a lado compartilhando sonhos e alegrias. Nem mesmo o por do sol,"
				+ "\nnem o sorriso desse dia lindo se iguala a grandeza desse sentimento que sinto"
				+ "\npor você. Você é o meu tudo, sem a sua presença eu me perco, meu tudo vira"
				+ "\nnada, só você me alimenta, me da prazer, todos os meus mais belos sonhos você"
				+ "\nfaz virar realidade. Que seja assim enquanto existir, farei de tudo para não"
				+ "\ndeixar o que sinto por você acabar e seguirei assim. Pois te querer bem e amar"
				+ "\nvocê é uma doce maravilha."
				+ "\nParabéns pelo dia de hoje meu amor e, para nós, um sempre..."
				+ "\n\n   Feliz Dia dos Namorados!"
				+ "\n-----------------------------------------------------------------------------"
				+ "\n\n");
	}
}
