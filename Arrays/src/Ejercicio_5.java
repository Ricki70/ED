
public class Ejercicio_5 {

	public static void main(String[] args) {

		int n1;
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
		n1 = array[array.length - 1];
		array[array.length - 1] = array[0];
		array[0] = n1;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nFin del programa");
		
	}

}
