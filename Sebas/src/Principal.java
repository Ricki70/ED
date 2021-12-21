
public class Principal {

	public static void main(String[] args) {
	Caracol[] caracoles = {
				new Caracol("blanco"),
				new Caracol("azul"),
				new Caracol("rojo")
		};
		
		Carrera carrera = new Carrera(caracoles, 50);
		
		carrera.jugar();
		
		System.out.println("Ganó " + carrera.ganador().getNombre());
	}

}
