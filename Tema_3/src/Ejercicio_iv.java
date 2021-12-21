
public class Ejercicio_iv {
	
	public static void main(String[] args) {
		
		int suma = 0;
		int aux = 0;
		int n1 = 0;
		
		for(int i = 1; i <= 9; i++) {
			n1 = (int) (Math.random() * 10);
			suma += n1;
			
			if (i == 1) {
				aux = n1;
			}
		}
		if (n1 == aux) {
			suma /= 9;
			System.out.println("La media es: " + suma);
		}
		System.out.println("Fin del programa");
	}
}
