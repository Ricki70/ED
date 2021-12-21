import java.util.Scanner;

public class Ejercicio_v {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclear un numero entero: ");
		int  n1 = teclado.nextInt();
		teclado.close();
		
		System.out.println("Los divisores de " + n1 + "son: ");
		for(int i = 2; i <= n1; i++) {
			if (n1 % i == 0) {
				System.out.print(" |" + n1 / i + "| ");
			}
		}
		System.out.println("Fin del programa");

	}

}
