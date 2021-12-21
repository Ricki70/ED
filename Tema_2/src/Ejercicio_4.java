import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclear un valor booleano: ");
		Boolean  bool1 = teclado.nextBoolean();
		System.out.println("Teclear otro valor booleano: ");
		Boolean  bool2 = teclado.nextBoolean();
		
		if (bool1 == bool2) {
			System.out.println(bool1 + " y " + bool2 + " Son de igual valor");
		}else {
			System.out.println(bool1 + " y " + bool2 + " Son de valor contrario");
		}
		
		teclado.close();

	}

}
