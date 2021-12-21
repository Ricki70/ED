package Clase_09;

public class Recursividad {
	
	public static int PotenciaR(int base, int exponente) {
		int sol;
		if (exponente == 0) {
			return 1;
		}
		
		sol = base * PotenciaR(base, exponente - 1);
		return sol;
	}
	
	public static String InversaR (String pal) {
		String sol = "";
		String aux;
		if (pal.length() == 0 || pal.length() == 1) {
			sol = pal;
		}else {
			aux = pal.substring(pal.length() - 1, pal.length());
			sol += aux + InversaR(pal.substring(0, pal.length() - 1));
		}
		
		return sol;
	}

}
