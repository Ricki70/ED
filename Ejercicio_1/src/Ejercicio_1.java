
public class Ejercicio_1 {

	public static void main(String[] args) {
	
		/*Declaro e Inicializo las variables solicitadas*/
		int N = 7;
		double A = 10.5;
		char C = 'Z';
		
		/*Muestro en pantalla las variables anteriormente declaradas*/
		System.out.println ("============\n| N = " + N + "    |\n| A = " + A + " |\n| C = " + C + "    |\n============\n\n");
		
		/*Opero las variables de manera consecuente con el ejercicio*/
		double operacion1 = (double)N + A;/*Conversion de tipo INT a tipo DOUBLE*/
		double operacion2 = A -(double)N;
		int operacion3 = (int)C; /*Conversion de tipo CHAR a tipo INT*/
		
		/*Imprimo los resultados de las operaciones anteriormente realizadas*/
		System.out.println("N + A = " + operacion1);
		System.out.println("A - N = " + operacion2);
		System.out.println("El valor numerico correspondiente al caracter \"C\" en ASCII es: " + operacion3);

	}

}
