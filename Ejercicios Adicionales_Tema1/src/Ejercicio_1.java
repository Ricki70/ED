
public class Ejercicio_1 {

	public static void main(String[] args) {
		double Km = Math.round((Math.random() * 100) * 100.0) / 100.0;
		double consumo = Math.round((Math.random() * 10) * 100.0) / 100.0;
		
		double CombustibleporKm = (consumo / Km);
		
		System.out.println("La motocicleta consume " + consumo + " litros en " + Km + " Kilometros");
		System.out.println("La motocicleta consume: " + Math.round(CombustibleporKm * 100.0) / 100.0 + " Litros por Km");

	}

}
