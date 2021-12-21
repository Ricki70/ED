package Ejercicio_Circulo;

/**
 * @author Ricardo de Antonio Aguirre
 * @version 1.0
 * @since 1/12/2021
 */

public class Test {
	/**
	 * declara e inizializa los objetos de la clase Circulo y llama a las funciones correspondientes para comparar c1, c2 y c3
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo c1 = new Circulo(5.5);
		Circulo c2 = new Circulo(10.1);
		Circulo c3 = new Circulo(10.9);

		if (c2.esIgual(c3, false)) {
			System.out.println("c2 y c3: iguales sin considerar decimales");
		} else {
			System.out.println("c2 y c3: distintos sin considerar decimales");
		}
		if (c2.esIgual(c3, true)) {
			System.out.println("c2 y c3: iguales considerando decimales");
		} else {
			System.out.println("c2 y c3: distintos considerando decimales");
		}
		if (c1.esIgual(c3, false)) {
			System.out.println("c1 y c3: iguales sin considerar decimales");
		} else {
			System.out.println("c1 y c3: distintos sin considerar decimales");
		}
	}
}