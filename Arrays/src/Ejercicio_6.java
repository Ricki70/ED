
public class Ejercicio_6 {

	public static void main(String[] args) {
		
		long n1 = 1;
		long array[] = new long[5];
		
		for (int i = 1; i < array.length + 1; i++) {
			n1 *= i;
			array[i - 1] = n1;
			System.out.println(array[i - 1] + " ");
		}
		
		System.out.println("\nFin del programa");

	}

}
