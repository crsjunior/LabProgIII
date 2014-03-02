package exercicio4;

public class Principal
{
	public static void main(String[] args)
	{
		DiaDosNamorados dn = new DiaDosNamorados("Rosana");
		dn.message();
		
		Natal natal = new Natal("Tio Tony");
		natal.message();
		
		Aniversario niver = new Aniversario("Cabral");
		niver.message();
	}
}
