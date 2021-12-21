import java.util.Scanner;

public class Ejercicio_vii {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclear un numero entero: ");
		int  n1 = teclado.nextInt();
		teclado.close();
		int factorial = 1;
		
		for (int i = 1; i <= n1; i++) {
			factorial *= i;
		}
		System.out.println("El factorial de |" + n1 + "| es: " + factorial);
		System.out.println("Fin del programa");
	}

}
