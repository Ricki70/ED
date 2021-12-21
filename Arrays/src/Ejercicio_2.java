
public class Ejercicio_2 {

	public static void main(String[] args) {
		int array[] = new int[100];
		
		System.out.println("Posicion\tValor\n");
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = (int)(Math.random() * 100);
			if (i % 2 != 0) {
				System.out.println(i + "\t\t" + array[i]);
			}
		}
		
		System.out.println("\nFin del programa");

	}

}
