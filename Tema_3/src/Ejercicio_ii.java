
public class Ejercicio_ii {

	public static void main(String[] args) {
		
		int suma = 0;
		for (int i = 1; i <= 20; i++) {
			int n1 = (int) (Math.random() * 10);
			suma += n1;
			System.out.print(n1 + ", ");
		}
		
		System.out.println("\n\nLa media es: " + (suma / 20.0));

		System.out.println("Fin del programa");
	}

}
