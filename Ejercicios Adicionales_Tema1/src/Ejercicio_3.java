
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		double var1 = Math.round((Math.random() * 100) * 100.0) / 100.0;
		int var2 = (int)(Math.random() * 100);
		
		double var3 = var1 + var2;
		
		System.out.println(var1 + " + " + var2 + " = " + var3);
	}

}
