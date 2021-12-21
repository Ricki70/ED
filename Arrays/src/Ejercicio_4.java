import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1;
		int array[] = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		
		do {
			System.out.println("Introduce un numero entero entre 0 y 100: ");
			n1 = teclado.nextInt();
		}while (n1 < 1 || n1 > 100);
		
		System.out.println("\nFin del programa");
		teclado.close();
	}

}
