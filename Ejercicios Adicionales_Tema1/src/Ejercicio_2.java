
public class Ejercicio_2 {

	public static void main(String[] args) {
		
		double var1 = Math.round((Math.random() * 100) * 100.0) / 100.0;
		double var2 = Math.round((Math.random() * 100) * 100.0) / 100.0;
		double var3 = Math.round((Math.random() * 100) * 100.0) / 100.0;

		double suma = (var1 + var2);
		
		System.out.println(var1 + " + " + var2 + " = " + Math.round(suma * 100.00) / 100.0);
		System.out.println("La suma * " + var3 + " = " + Math.round((suma*var3) * 100.00) / 100.0);
	}

}
