
public class Ejercicio_viii {

	public static void main(String[] args) {
		
		int factorial;
		for (int i = 1; i <= 10; i++) {
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			System.out.println("El factorial de |" + i + "| es: " + factorial);
		}
		System.out.println("Fin del programa");


	}

}
