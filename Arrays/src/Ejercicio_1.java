import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = array.length - 1, j = 1; i >= 0; i--, j++) {
			System.out.println("Escribe n" + j + ": ");
			array[i] = teclado.nextInt();
		}
		
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("\nFin del programa");
		teclado.close();
		
	}

}
