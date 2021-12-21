import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		String string = teclado.nextLine();
		
		System.out.println("Buenos dias " + string + ".");
		
		teclado.close();
		
	}

}
