package exercicio2;

import java.util.Calendar;
import java.util.Scanner;

public class SignosHoroscopoChines
{
	// Declaração das arrays que contem os intevalos de tempo (com os intervalos separados por virgula)
	// correspondentes a cada um dos signo do horoscopo chines:
	private static final String[] SIGNO_RATO = {
		"31-01-1900,18-02-1901", "18-02-1912,05-02-1913", "05-02-1924,24-01-1925", "24-01-1936,10-02-1937", "10-02-1948,28-01-1949",
		"28-01-1960,14-02-1961", "15-02-1972,02-02-1973", "02-02-1984,19-02-1985", "19-02-1996,06-02-1997", "07-02-2008,25-01-2009"
	};
	private static final String[] SIGNO_BOI = {
		"19-02-1901,07-02-1902", "06-02-1913,25-01-1914", "25-01-1925,12-02-1926", "11-02-1937,30-01-1938", "29-01-1949,16-02-1950",
		"15-02-1961,04-02-1962", "03-02-1973,22-01-1974", "20-02-1985,08-02-1986", "07-02-1997,27-01-1998", "26-01-2009,13-02-2010"
	};
	private static final String[] SIGNO_TIGRE = {
		"08-02-1902,28-02-1903", "26-01-1914,13-02-1915", "13-02-1926,01-02-1927", "31-01-1938,18-02-1939", "17-02-1950,05-02-1951",
		"05-02-1962,24-01-1963", "23-01-1974,10-02-1975", "09-02-1986,28-01-1987", "28-01-1998,15-02-1999", "14-02-2010,02-02-2011"
	};
	private static final String[] SIGNO_COELHO = {
		"29-01-1903,15-02-1904", "14-02-1915,02-02-1916", "02-02-1927,22-01-1928", "19-02-1939,07-02-1940", "06-02-1951,26-01-1952",
		"25-01-1963,12-02-1964", "11-02-1975,30-01-1976", "29-01-1987,16-02-1988", "16-02-1999,04-02-2000", "03-02-2011,22-01-2012"
	};
	private static final String[] SIGNO_DRAGAO = {
		"16-02-1904,03-02-1905", "03-02-1916,22-01-1917", "23-01-1928,09-02-1929", "08-02-1940,26-01-1941", "27-01-1952,13-02-1953",
		"13-02-1964,01-02-1965", "31-01-1976,17-02-1977", "17-02-1988,05-02-1989", "05-02-2000,24-01-2001", "23-01-2012,09-02-2013"
	};
	private static final String[] SIGNO_SERPENTE = {
		"04-02-1905,24-01-1906", "23-01-1917,10-02-1918", "10-02-1929,29-01-1930", "27-01-1941,14-02-1942", "14-02-1953,02-02-1954",
		"02-02-1965,20-01-1966", "18-02-1977,06-02-1978", "06-02-1989,26-01-1990", "25-01-2001,11-02-2002", "10-02-2013,30-01-2014"
	};
	private static final String[] SIGNO_CAVALO = {
		"25-01-1906,12-02-1907", "11-02-1918,31-01-1919", "30-01-1930,16-02-1931", "15-02-1942,04-02-1943", "03-02-1954,23-01-1955",
		"21-01-1966,08-02-1967", "07-02-1978,27-01-1979", "27-01-1990,14-02-1991", "12-02-2002,31-01-2003", "31-01-2014,18-02-2015"
	};
	private static final String[] SIGNO_CABRA = {
		"13-02-1907,01-02-1908", "01-02-1919,19-02-1920", "17-02-1931,05-02-1932", "05-02-1943,24-01-1944", "24-01-1955,11-02-1956",
		"09-02-1967,29-01-1968", "28-01-1979,15-02-1980", "15-02-1991,03-02-1992", "01-02-2003,21-01-2004", "19-02-2015,07-02-2016"
	};
	private static final String[] SIGNO_MACACO = {
		"02-02-1908,21-01-1909", "20-02-1920,07-01-1921", "06-02-1932,25-01-1933", "25-01-1944,12-02-1945", "12-02-1956,30-01-1957",
		"30-01-1968,16-02-1969", "16-02-1980,04-02-1981", "04-02-1992,22-01-1993", "22-01-2004,08-02-2005", "08-02-2016,27-01-2017"
	};
	private static final String[] SIGNO_GALO = {
		"22-01-1909,09-02-1910", "08-02-1921,27-01-1922", "26-01-1933,14-02-1934", "13-02-1945,01-02-1946", "31-01-1957,17-02-1958",
		"17-02-1969,05-02-1970", "05-02-1981,24-01-1982", "23-01-1993,09-02-1994", "09-02-2005,28-01-2006", "28-01-2017,18-02-2018"
	};
	private static final String[] SIGNO_CAO = {
		"10-02-1910,29-01-1911", "28-01-1922,15-02-1923", "15-02-1934,03-02-1935", "02-02-1946,21-01-1947", "18-02-1958,07-02-1959",
		"06-02-1970,26-01-1971", "25-01-1982,12-02-1983", "10-02-1994,30-01-1995", "29-01-2006,17-02-2007", "19-02-2018,04-02-2019"
	};
	private static final String[] SIGNO_PORCO = {
		"30-01-1911,17-02-1912", "16-02-1923,04-02-1924", "04-02-1935,23-01-1936", "22-01-1947,09-02-1948", "08-02-1959,27-01-1960",
		"27-01-1971,14-02-1972", "13-02-1983,01-02-1984", "31-01-1995,18-02-1996", "18-02-2007,06-02-2008", "05-02-2019,24-01-2020"
	};
	
	// Array das arrays que contem os intervalos de tempo de cada signo do horoscopo chines.
	// (INFO: Esta array sera usada no algoritmo que fara a pesquisa do signo):
	private static final String[][] SIGNOS_DATAS = {
		SIGNO_RATO, SIGNO_BOI, SIGNO_TIGRE, SIGNO_COELHO, SIGNO_DRAGAO, SIGNO_SERPENTE,
		SIGNO_CAVALO, SIGNO_CABRA, SIGNO_MACACO, SIGNO_GALO, SIGNO_CAO, SIGNO_PORCO
	};
	
	// Array com os nomes de cada um dos signos do horoscopo chines:
	private static final String[] SIGNOS_NOMES = {
		"Rato", "Boi", "Tigre", "Coelho", "Dragão", "Serpente", "Cavalo", "Cabra", "Macaco", "Galo", "Cão", "Porco"
	};
	
	/**
	 * Converte uma data de uma String (no formato dd-mm-aaaa ou dd/mm//aaaa) para um objeto do tipo Calendar.
	 * @param data String com a data a ser convertida (no formato: dd-mm-aaaa ou dd/mm/aaaa).
	 * @return Um objeto do tipo Calendar com a data setada conforme a passada pelo parametro data.
	 */
	private static Calendar converteDataDeStringParaCalendar(String data)
	{
		Calendar tempData = Calendar.getInstance();
		tempData.set(
				Integer.parseInt(data.substring(6, 10)),
				Integer.parseInt(data.substring(3, 5)) - 1,
				Integer.parseInt(data.substring(0, 2))
				);
		return tempData;
	}
	
	/**
	 * Pesquisa e encontra o signo do horoscopo chines correspondente a uma data.
	 * @param data String com a data a ser pesquisada (no formato: dd-mm-aaaa ou dd/mm/aaaa).
	 * @return Uma String com o nome do signo do horoscopo chines correspondente a data.
	 */
	private static String pesquisaSigno(String data)
	{
		Calendar dataPesquisada = converteDataDeStringParaCalendar(data);
		Calendar dataInicioIntervalo;
		Calendar dataFimIntervalo;
		for (int i = 0; i < SIGNOS_DATAS.length; i++) {
			for (int j = 0; j < SIGNOS_DATAS[i].length; j++) {
				String[] arrDatas = SIGNOS_DATAS[i][j].split(",");
				dataInicioIntervalo = converteDataDeStringParaCalendar(arrDatas[0]);
				dataFimIntervalo = converteDataDeStringParaCalendar(arrDatas[1]);
				if (dataPesquisada.compareTo(dataInicioIntervalo) >= 0 && dataPesquisada.compareTo(dataFimIntervalo) <= 0) {
					return SIGNOS_NOMES[i];
				}
			}
		}
		return "nâo pode ser encontrado!";
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Data de nascimento [dd-mm-aaaa ou dd/mm/aaaa] (0 para sair): ");
			String dataNasc = scanner.nextLine();
			if (dataNasc.equals("0")) {
				break;
			}
			System.out.println("Signo Chinês: " + pesquisaSigno(dataNasc));
		}
		scanner.close();
	}
}
