import java.util.Arrays;

/**
 * Carrera de caracoles
 * 
 * @author amadeo.mora
 */
public class Carrera {

	/**
	 * Lista de caracoles participantes
	 */
	private Caracol[] caracoles;
	
	/**
	 * Distancia de la carrera
	 */
	private double distancia;
	
	/**
	 * Constructor
	 * 
	 * @param caracoles
	 * @param distancia
	 */
	public Carrera(Caracol[] caracoles, double distancia) {
		this.caracoles = caracoles;
		this.distancia = distancia;
	}
	
	/**
	 * Bucle del juego
	 */
	public void jugar() {
		while (ganador() == null) {
			jugada();
			estado();	// Para visualizar la partida
		}
	}
	
	/**
	 * En cada una de las jugadas
	 * un caracol avanza uno
	 */
	private void jugada() {
		int caracolAleatorio = (int) (Math.random() * 1000) % caracoles.length;
		int distancia = 1;
		caracoles[caracolAleatorio].avanza(distancia);
	}
	
	/**
	 * Detecto si alguien ha ganado. 
	 * Si ocurre devuelvo el ganador.
	 * 
	 * @return caracol ganador o null si no ha ganado nadie todavía
	 */
	public Caracol ganador() {
		Caracol ganador = null;
		for (int i = 0; i < caracoles.length; i++) {
			if (caracoles[i].getDistancia() >= distancia) {
				ganador = caracoles[i];
			}
		}
		return ganador;
	}

	/**
	 * Panel de estado donde se muestra la situación
	 * en un momento dado
	 */
	private void estado() {
		System.out.println("\n\n\nJugada");
		for (int i = 0; i < caracoles.length; i++) {
			System.out.println(caracoles[i].getNombre() + ":\t" + "=".repeat((int) caracoles[i].getDistancia()));
		}
	}
	
	@Override
	public String toString() {
		return "Carrera [caracoles=" + Arrays.toString(caracoles) + ", distancia=" + distancia + "]";
	}
}
