import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void rectangulo() {
		
	}
	
	public static void main(String[] args) {
		
		Limpiar();
		
		/*======== Declaracion de variables ========*/
		
		Scanner teclado = new Scanner(System.in);
		int base, altura;
		Boolean comprobacion = true;
		
		/*======== Impresion del menú ========*/
		
		System.out.println("=============================================\n"
						+ "|      Area de un poligono de 4 lados       |\n"
						+ "=============================================\n");

		System.out.println("Area de un rectangulo (pulse 1)\n\nArea de un cuadrado (pulse 2)\n\n");
		
		System.out.println("Haga su eleccion: ");
		int n1 = teclado.nextInt();					//Solicito el valor de la variable empleada para elegir una u otra opcion
		
		/*======== Bucle de seleccion y ejecucion de la funcion del programa ========*/
		
		while (comprobacion) {		//Bucle que evalua si has metido un valor correcto o no, en tal caso repite el bloque de ejecucion
			
			/*======== Caso para cuando eliges el area del rectangulo ========*/
			
			if (n1 == 1) {
				Limpiar();
				System.out.println("===================================\n"
								+ "|       Area de un rectangulo      |\n"
								+ "====================================\n");
				System.out.println("Introduzca el valor de la base del rectanculo: ");
				base = teclado.nextInt();
				System.out.println("Introduzca el valor de la altura del rectanculo: ");
				altura = teclado.nextInt();
				rectangulo(base, altura);
				comprobacion = false;
				
			/*======== Caso para cuando eliges el cuadrado del programa ========*/
				
			}else if (n1 == 2) {
				Limpiar();
				System.out.println("=================================\n"
								+ "|       Area de un cuadrado      |\n"
								+ "==================================\n");
				System.out.println("Introduzca el valor del lado del cuadrado: ");
				base = teclado.nextInt();
				altura = base;
				rectangulo(base, altura);
				comprobacion = false;
				
			/*======== Caso para cuando eliges una variable no contemplada dentro del rango ========*/	
			
			}else {
				Limpiar();
				System.out.println("El numero introducido se sale de rango, introduzca un valor comprendido entre (1 <= n <= 2)\n");
				System.out.println("Area de un rectangulo (pulse 1)\n\nArea de un cuadrado (pulse 2)\n\n");
				System.out.println("Haga su eleccion: ");
				n1 = teclado.nextInt();
			}
		}
		
		teclado.close();
	}
	
	/*======== Funcion que imprime graficamente tu cuadrado ========*/
	
	public static void rectangulo(int base, int altura){
		char s1 = ':';
		char s2 = '-';
		
		Limpiar();
		System.out.println("\nLos valores introducidos son:\n\nBASE ---> |" + base + "|\n\nALTURA ---> |" + altura + "|\n");
		System.out.println("AREA ---> |" + (base * altura) + "|\n");
		
		for (int i = 0; i < base; i++) {
			System.out.print(s2);
		}
		
		System.out.println("");
		for (int i = 0; i < altura / 2; i++) {
			System.out.print(s1);
			for (int j = 0; j < base - 2; j++) {
				System.out.print(" ");
			}
			
			if (i == altura / 4) {
				System.out.println(s1 + " " + altura);
				
			}else{
			System.out.println(s1);
			
			}
		}
		
		for (int i = 0; i < base; i++) {
			System.out.print(s2);
		}
		System.out.println();
		for (int i = 0; i < base / 2; i++) {
			System.out.print(" ");
		}
		System.out.println(base);
	}
	
	/*======== Funcion para limpiar el terminal ========*/
	
	public static void Limpiar(){

		try {

			if (System.getProperty("os.name").contains("Windows"))

				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	            else

	                Runtime.getRuntime().exec("clear");

	        } catch (IOException | InterruptedException ex) {}
	    }	

}
