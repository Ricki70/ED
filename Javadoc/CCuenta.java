package practicaunidad3;

/**
 * Esta clase declara los atributos de la clase, nombre, cuenta, saldo y tipointeres
 * @author Ricardo de Antonio Aguirre
 * @version 1.0
 * @since 1/12/2001
 */
public class CCuenta {

	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	public CCuenta() {
	}

	/**
	 * Declara un constructor con los atributos de la clase
	 * @param nom, nombre del cliente
	 * @param cue, cuenta del cliente
	 * @param sal, saldo de la cuenta
	 * @param tipo, tipo de interes de la cuenta
	 */
	
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}

	/**
	 * Metodo de tipo setter que asigna un nombre a la variable "nombre"
	 * @param nom, nombre del cliente
	 */
	
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Metodo getter que devuelve el valor de "nombre"
	 */
	
	public String obtenerNombre() {
		return nombre;
	}

	/**
	 * metodo getter que devuelve el valor de "estado"
	 */
	
	public double estado() {
		return saldo;
	}
	
	/**
	 * metodo que comprueba que el saldo no sea negativo y si no lo es, suma el saldo mas la cantidad
	 * @param cantidad
	 */

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * comprueba que la cantidad y el saldo sean positivos y devuelve el saldo - la cantidad
	 * @param cantidad
	 */
	
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * metodo getter que devuelve el valor de "cuenta"
	 */
	
	public String obtenerCuenta() {
		return cuenta;
	}

	/**
	 * metodo setter que establece el valor de "cuenta"
	 * @param cuenta
	 */
	
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**metodo setter que establece el valor de "saldo"
	 * 
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * metodo getter que devuelve el valor de "tipointeres"
	 */
	
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * metodo setter que establece el valor de "tipointeres"
	 * @param tipointeres
	 */

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
