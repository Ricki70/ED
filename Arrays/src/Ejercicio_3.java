
public class Ejercicio_3 {

	public static void main(String[] args) {
		double array[] = new double[100];
		int suma = 0;
		int contador = 0;
		
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = Math.round((Math.random() * 100) * 100.0) / 100.0;
			System.out.print(array[i] + " - ");
			suma += array[i];
		}
		double media = suma / (double)(array.length);
		System.out.println("\n\nLa media es: " + media + "\n");
		
		for (int i = 0; i <= array.length - 1; i++) {
			if(array[i] >= media) {
				contador++;
			}
		}
		
		System.out.println(contador + " Alumnos superan la nota media");
		
		System.out.println("\nFin del programa");

	}

}
