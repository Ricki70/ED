import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca 2 valores enteros diferentes: ");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		teclado.close();
		
		if ((n1 == 0) || (n2 == 0)) {
			System.out.println("No se puede dividir entre 0");
		}else if (n1 == n2) {
			System.out.println(n1 + " es igual a " + n2);
		}else if (n1 % n2 == 0){
			System.out.println(n1 + " es multiplo de " + n2);
		}else if (n2 % n1 == 0){
				System.out.println(n2 + " es multiplo de " + n1);
		}else {
			System.out.println(n1 + " no es multiplo de " + n2);
		}

		System.out.println("Fin del programa");
	}

}
