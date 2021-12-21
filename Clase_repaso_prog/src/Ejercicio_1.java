import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nuero de notas: ");
		int notas = teclado.nextInt();
		System.out.println("Introduce la nota de corte: ");
		int notadecorte = teclado.nextInt();
		int contadorsuperior = 0;
		int contadorigual = 0;
		int array[] = new int[notas];
		
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + " ");
			
			if (array[i] == notadecorte) {
				contadorigual++;
			}else if (array[i] > notadecorte) {
				contadorsuperior++;
			}
		}
		
		System.out.println("\n\nLa nota de corte es |" + notadecorte + "|");
		System.out.println("Hay |" + contadorigual + "| iguales a la nota de corte");
		System.out.println("Hay |" + contadorsuperior + "| superiores a la nota de corte");
		
		teclado.close();
		System.out.println("\nFIN DEL PROGRAMA");

	}

}
