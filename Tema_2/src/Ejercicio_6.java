import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca 3 valores enteros diferentes: ");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int n3 = teclado.nextInt();
		teclado.close();
		
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println(n1 + " Es mayor que " + n2 + " y " + n3);
			
		}else if (n2 > n3){
			System.out.println(n2 + " Es mayor que " + n1 + " y " + n3);
			
		}else{
			System.out.println(n3 + " Es mayor que " + n1 + " y " + n2);
			
		}
		
	}

}
