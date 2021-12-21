import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca 1 valor entero: ");
		int n1 = teclado.nextInt();
		teclado.close();
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(n1 + " * " + i + " = " + (n1 * i));
		}

	}

}
