import java.util.Scanner;

public class Ejercicio_Strings {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres: ");
		String hola1 = teclado.nextLine();
		teclado.close();
		
		String hola2 = hola1.replace('o', 'a');
		System.out.println(hola2);
		
		System.out.println(hola1.charAt(0));
		System.out.println(hola1.charAt(1));
		System.out.println(hola1.charAt(2));
		System.out.println(hola1.charAt(3));
		
		System.out.println(hola1.length());
		
		for (int i = 0; i < hola1.length(); i++) {
			System.out.println(hola1.charAt(i));
		}

	}

}
