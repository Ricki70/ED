
public class Ejercicio_x {

	public static void main(String[] args) {
		
		boolean primo = true;
		
		for (int i = 1; i <= 100; i++) {
			primo = true;
			for(int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
			}
		}
			System.out.println("Fin del programa");


	}

}
