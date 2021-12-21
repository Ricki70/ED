
public class Ejercicio_3 {

	public static void main(String[] args) {

		int A = 5;
		int B = 10;
		int C = 15;
		int D = 20;
		int aux1, aux2;
		
		System.out.println("A = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
		
		aux1 = B; /*aux1 ahora tiene el valor de B*/
		B = C;
		
		aux2 = D; /*aux2 ahora tiene el valor de D*/
		D = aux1;
		
		aux1 = A; /*aux1 ahora tiene el valor de A*/
		A = aux2;
		
		C = aux1;
		
		System.out.println("\nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
	}

}
