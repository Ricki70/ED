import java.util.Scanner;

public class Ejercicio_8_v2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int menor, intermedio, mayor;
		System.out.println("Introduzca 1 valor enteros diferentes: ");
		int n1 = teclado.nextInt();
		menor = n1;					//Mientras no se demuestre lo contrario n1 es el menor
		
		System.out.println("Introduzca 1 valor enteros diferentes: ");
		int n2 = teclado.nextInt();
		if (n2 > menor) {			//Si n2 > menor => n2 = intermedio porque es mayor que menor
			intermedio = n2;
		}else {
			menor = n2;				//si no, n2 es el nuevo menor y  n1 es el intermedio
			intermedio = n1;
		}
		
		System.out.println("Introduzca 1 valor enteros diferentes: ");
		int n3 = teclado.nextInt();
		if (n3 > intermedio) {
			mayor = n3;				//Si n3 es mayor que menor e intermedio, n3 es el nuevo mayor
		}else if (n3 > menor) {
			mayor = intermedio;		// Si n3 es mayor que menor pero menor que mayor
			intermedio = n3;		//hay que desplazar intermedio a mayor para hacer hueco a n3
			
		}else {
			mayor = intermedio;		// Si n3 es el menor de todos, hay que desplazar los restantes
			intermedio = menor;
			menor = n3;
		}
		
		teclado.close();
		
		System.out.println(mayor + ", " + intermedio + ", " + menor);
		
		System.out.println("Fin del programa");

	}

}
