
public class Ejercicio_iii {

	public static void main(String[] args) {
		
		int contador = 1;
		int aux = 0;
		for(int i = 1; i <= 40; i++) {
			int n1 = (int) (Math.random() * 10);
			System.out.print(n1 + " ");
			
			if (n1 == aux) {
				contador++;
			} else if (n1 > aux) {
				aux = n1;
				contador = 1;
			}
		}
		
		System.out.println("\n\nEl numero mayor es: |" + aux + "| y se repite: " + contador + " veces");
		
		System.out.println("\nFin del programa");
	}

}
