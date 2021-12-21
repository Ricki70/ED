import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1 = 0;
		boolean repetido = false;
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			repetido = false;
			System.out.println("Introduzca n" + (i + 1) + ": ");
			array[i] = teclado.nextInt();

			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) { 
					repetido = true;
					n1 = array[j];
				}
			}
			
			if (repetido == true) {
				System.out.print("El numero introducido se repite en la posicion |" + n1 + "| introduzca de nuevo ");
				i--;
			}
		}
		
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nFin del programa");
		teclado.close();
	}

}
