import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca 1 valor enteros: ");
		int n1 = teclado.nextInt();
		System.out.println("Introduzca 1 valor enteros: ");
		int n2 = teclado.nextInt();
		teclado.close();
		
		if ((n1 % 2 == 0) && (n2 % 2 == 0)) {
			System.out.println(n1 + " y " + n2 + " Son PARES");
		}else if ((n1 % 2 != 0) && (n2 % 2 != 0)) {
			System.out.println(n1 + " y " + n2 + " Son IMPARES");
		}else if (n1 % 2 == 0) {
			System.out.println(n1 + " es PAR y " + n2 + " es IMPAR");
		}else {
			System.out.println(n1 + " es IMPAR y " + n2 + " es PAR");
		}
		
		System.out.println("Fin del programa");
	}

}
