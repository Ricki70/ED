import java.io.IOException;

public class Pelota_Saltarina {

	public static void main(String[] args) throws InterruptedException {
		
		String[] array = new String [40];
		int aux = 2;
		
		for (int i = 0; i < 40; i++){
			array[i] = "_";
		}

		while (true) {
			
			for (int iter = 0; iter < 40; iter++) {
				array[iter] = "o";
				if (iter < aux) {
					array[aux] = "o";
				}else if (iter == aux - 1) {
					array[aux - 1] = "o";
				}
				
				for (int i = 0; i < 40; i++) {
					System.out.print(array[i]);
				}
				
				if (iter == aux - 1) {
					array[iter] = "o";
				}else {
					array[iter] = "_";
				}
				
				if (aux == 0) {
					aux = 39;
				}
				
				Thread.sleep(15);
				Limpiar();
			}
			aux -= 1;
		}

	}
	public static void Limpiar(){

	try {

		if (System.getProperty("os.name").contains("Windows"))

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            else

                Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}
    }	
	
}

