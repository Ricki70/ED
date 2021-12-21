import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce cadena con espacios: ");
		String cadena = sc.nextLine();
		String aux = new String (cadena.toUpperCase());
		
		String[] trozos = aux.split(" ");
		
		String salida = "";
		
		for (String cadena1 : trozos) {
		
			salida += cadena1;
		}
		sc.close();
		System.out.println(cadena + "\n" + salida);

	}

}
