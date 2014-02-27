package horoscopoChines;

import java.util.Calendar;
import java.util.Scanner;

public class HoroscopoChines
{
	private static final String[][] DATAS = {
		SignosHoroscopoChines.A_RATO, SignosHoroscopoChines.B_BOI, SignosHoroscopoChines.C_TIGRE, SignosHoroscopoChines.D_COELHO,
		SignosHoroscopoChines.E_DRAGAO, SignosHoroscopoChines.F_SERPENTE, SignosHoroscopoChines.G_CAVALO, SignosHoroscopoChines.H_CABRA,
		SignosHoroscopoChines.I_MACACO, SignosHoroscopoChines.J_GALO, SignosHoroscopoChines.K_CAO, SignosHoroscopoChines.L_PORCO
	};
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Data de nascimento [dd-mm-aaaa ou dd/mm/aaaa] (0 para sair): ");
			String dataNasc = scanner.nextLine();
			if (dataNasc.equals("0")) {
				break;
			}
			System.out.println("Signo Chinês: " + pesquisa(dataNasc));
		}
		
		scanner.close();
	}
	
	public static String pesquisa(String dataNasc)
	{
		Calendar dataInicio = Calendar.getInstance();
		Calendar dataFim = Calendar.getInstance();
		Calendar dataPesquisada = Calendar.getInstance();
		dataPesquisada.set(
				Integer.parseInt(dataNasc.substring(6, 10)),
				Integer.parseInt(dataNasc.substring(3, 5)) - 1,
				Integer.parseInt(dataNasc.substring(0, 2))
				);
		for (int i = 0; i < DATAS.length; i++) {
			for (int j = 0; j < DATAS[i].length; j++) {
				String[] arrDatas = DATAS[i][j].split(",");
				dataInicio.set(
						Integer.parseInt(arrDatas[0].substring(6, 10)),
						Integer.parseInt(arrDatas[0].substring(3, 5)) - 1,
						Integer.parseInt(arrDatas[0].substring(0, 2))
						);
				dataFim.set(
						Integer.parseInt(arrDatas[1].substring(6, 10)),
						Integer.parseInt(arrDatas[1].substring(3, 5)) - 1,
						Integer.parseInt(arrDatas[1].substring(0, 2))
						);
				if (dataPesquisada.compareTo(dataInicio) >= 0 && dataPesquisada.compareTo(dataFim) <= 0) {
					return SignosHoroscopoChines.SIGNOS_NOMES[i];
				}
			}
		}
		return "nâo pode ser encontrado!";
	}
}
