import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el numero de cartas con el que quiere jugar: ");
		int nCartas = teclado.nextInt();
		System.out.println("Introduzca el valor maximo que desea que tengan sus cartas: ");
		int ValorMax = teclado.nextInt();
		System.out.println("");
		int aciertos = 0;
		double porcentaje = 0;
		boolean control;
		
		int matriz [][] = new int [2][nCartas];
		
		for (int columna = 0; columna < nCartas; columna++) {
			matriz [0][columna] = (int)(Math.random() * ValorMax + 1);
 		}

		for (int columna = 0; columna < nCartas; columna++) {
			control = true;
			System.out.println("Introduzca la Carta " + (columna + 1) + ": ");
			matriz[1][columna] = teclado.nextInt();
			
			if (matriz[1][columna] < 1 || matriz[1][columna] > ValorMax) {
				System.out.println("El numero introducido se sale de rango -> 1 < x < " + ValorMax + "intentalo de nuevo: ");
				control = false;
			}
			
			if (matriz[0][columna] == matriz[1][columna]) {
				aciertos += 1;
			}
			
			if (!control) {
				columna--;
			}
 		}
		
		for (int fila = 0; fila < 2; fila++) {
			System.out.println("");
			for (int columna = 0; columna < nCartas; columna++) {
				System.out.print(matriz[fila][columna] + " ");
			}
		}
		
		porcentaje = (((double)aciertos / (double)nCartas) * 100);
		
		System.out.println("\n\nHas acertado: " + aciertos);
		System.out.println("porcentaje de error: " + porcentaje + "%");

		System.out.println("\n\nFinal del programa");
		teclado.close();
		
	}

}
