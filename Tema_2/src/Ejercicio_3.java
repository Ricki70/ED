import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclear un numero entero: ");
		int  n1 = teclado.nextInt();
		
		if ((n1 - 1) % 3 == 0) {
			System.out.println(n1-1 + " Es multiplo de 3");
		}else{
			System.out.println(n1-1 + " No es multiplo de 3");
		}
			
			
		if ((n1 + 1) % 3 == 0){
			System.out.println(n1+1 + " es multiplo de 3");
		}else{
			System.out.println(n1+1 + " No es multiplo de 3");
		}
		
		teclado.close();
	}

}
