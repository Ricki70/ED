package Ejercicio_Circulo;

/**
 * @author Ricardo de Antonio Aguirre
 * @version 1.0
 * @since 1/12/2021
 */

/**
 *declara la clase "Circulo" y su atributo "rad"
 */
public class Circulo {
	private double rad;

	/**
	 * metodo setter que establece el valor de "rad"
	 * @param radio
	 */
	public Circulo(double radio) {
		this.rad = radio;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}

	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}