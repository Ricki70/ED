import java.util.Scanner;

public class Ejercicio_ii {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		
		while (n1 != n2) {
		
			System.out.println("Escribe n1: ");
			n1 = teclado.nextInt();
			System.out.println("Escribe n2: ");
			n2 = teclado.nextInt();
			
			if (n1 != n2) {
				System.out.println("|" + n1 + "| no es igual a |" + n2 + "|");
			}else {
				System.out.println("|" + n1 + "| es igual a |" + n2 + "|");
			}
		}
		teclado.close();
		System.out.println("FIN DEL PROGRAMA");

	}

}
