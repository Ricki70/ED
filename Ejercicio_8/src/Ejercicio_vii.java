import java.util.Scanner;

public class Ejercicio_vii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean sw = true;
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		int[] vocales = new int [5];		//1 - a, 2 - e, 3 - i, 4 - o, 5 - u
		
		for(int i = 0; i < frase.length(); i++) {
			switch (frase.charAt(i)) {
			
			case 'a':
				vocales[0]++;
				break;
			case 'e':
				vocales[1]++;
				break;
			case 'i':
				vocales[2]++;
				break;
			case 'o':
				vocales[3]++;
				break;
			case 'u':
				vocales[4]++;
				break;
			}
		}
		
		for(int i = 0; i < vocales.length; i++) {
		
			if (vocales[i] == 0) {
				System.out.println("La frase no contiene todas las vocales " + frase);

				sw = false;
				break;
			}
		}
		
		if (sw) {
			System.out.println("La frase contiene todas las vocales " + frase);
		}
		
		System.out.println("FIN DEL PROGRAMA");

	}
	
}


