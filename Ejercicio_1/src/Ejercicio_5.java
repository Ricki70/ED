
public class Ejercicio_5 {

	public static void main(String[] args) {
		
		int C = 150;
		
		if (C >= 0) {
			System.out.println("\n" + C + " Es positivo");
		} else {
			System.out.println("\n" + C + " Es negativo");
		}
		
		if (C % 2 == 0) {
			System.out.println("\n" + C + " Es par");
		} else {
			System.out.println("\n" + C + " Es impar");
		}

		if (C % 5 == 0) {
			System.out.println("\n" + C + " Es multiplo de 5");
		} else {
			System.out.println("\n" + C + " No es multiplo de 5");
		}
		
		if (C % 10 == 0) {
			System.out.println("\n" + C + " Es multiplo de 10");
		} else {
			System.out.println("\n" + C + " No es multiplo de 10");
		}

		if (C < 100) {
			System.out.println("\n" + C + " Es menor que 100");
		} else {
			System.out.println("\n" + C + " Es mayor que 100");
		}
		
	}

}
