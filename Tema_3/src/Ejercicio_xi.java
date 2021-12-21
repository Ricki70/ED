
public class Ejercicio_xi {

	public static void main(String[] args) {
		
		boolean primo = true;
		int contador = 0;
		for (int i = 1; contador <= 100; i++) {
			primo = true;
			for(int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
				contador++;
			}
		}
			System.out.println("Fin del programa");
	}

}
