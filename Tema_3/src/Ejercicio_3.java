
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		int menor = 0;
		
		for (int i = 1; i <= 10; i++) {
			int aux = (int) (Math.random() * -100);
			System.out.print(aux + ", ");
			if(aux <= menor)
				menor = aux;
		}
		
		System.out.println("\n\nEl numero menor es: " + menor);

	}

}
