/**
 * Caracol
 * 
 * @author amadeo.mora
 */
public class Caracol {
	
	/**
	 * Nombre del caracol
	 */
	private String nombre;
	
	/**
	 * Distancia recorrida. Inicialmente a 0.
	 */
	private double distancia;
	
	/**
	 * Constructor
	 * 
	 * @param nombre
	 */
	public Caracol(String nombre) {
		this.nombre = nombre;
		distancia = 0;
	}

	/**
	 * Devuelve el nombre del caracol
	 * 
	 * @return nombre del caracol
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve la distancia recorrida por el caracol
	 * 
	 * @return distancia recorrida
	 */
	public double getDistancia() {
		return distancia;
	}
	
	/**
	 * Avance del caracol
	 * 
	 * @param distancia avanzada
	 */
	public void avanza(double distancia) {
		this.distancia = this.distancia + distancia;
	}

	@Override
	public String toString() {
		return "Caracol [nombre=" + nombre + ", distancia=" + distancia + "]";
	}
}
