import java.util.Scanner;

public class Ejercicio_ix {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclear un numero entero: ");
		int  n1 = teclado.nextInt();
		teclado.close();
		
		boolean primo = true;
		for(int i = 2; i <= n1 / 2; i++) {
			if (n1 % i == 0) {
				System.out.println("|" + n1 + "| No es PRIMO");
				primo = false;
				break;
			}
		}
		if (primo) {
			System.out.println("|" + n1 + "| Es PRIMO");
		}
		
		System.out.println("Fin del programa");


	}

}
