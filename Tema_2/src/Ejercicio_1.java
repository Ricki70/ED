import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclear un numero entero: ");
		int  n1 = teclado.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println(n1 + " Es par");
		}else {
			System.out.println(n1 + " Es impar");
		}
		
		teclado.close();
	}

}
