import java.util.Scanner;

public class Ejercicio_Scanner {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclear un numero entero: ");
		int  n1 = teclado.nextInt();
		int n2 = n1++;
		
		System.out.println(n2);
		System.out.println(n1);
		
		System.out.println("Teclear un numero decimal: ");
		double n3 = teclado.nextDouble();
		System.out.println(n3);
		
		System.out.println("Teclear un valor booleano: ");
		Boolean bool = teclado.nextBoolean();
		
		if (bool) {
			int random = (int) (Math.random() * 100);
			System.out.println(random);
		}else {
			System.out.println("La clase ha terminado");
		}
		
		System.out.println("Teclear un numero decimal: ");
		String string = teclado.nextLine();
		System.out.println(string);
		
		teclado.close();
	}

}
