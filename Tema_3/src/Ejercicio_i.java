
public class Ejercicio_i { 

	public static void main(String[] args) {
		
		boolean control = true;
		int n2 = 0;
		
		for (int i = 1; i <= 10; i++) {
			int n1 = (int) (Math.random() * 2);
			
			if ((n1 != n2) && (i != 1)) {
				control = false;
			}
			
			n2 = n1;
			System.out.println(n1);
		}
		
		if (control == true) {
			System.out.println("son iguales");
		}else {
			System.out.println("NO son iguales");
		}

		System.out.println("Fin del programa");
	}

}
