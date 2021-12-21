import java.io.IOException;
import java.util.Scanner;

public class Ahorcado_V2 {
	
	public static String letra = " ";
	
	public static boolean victoria;
	public static boolean fin = false;
	public static boolean control = false;

	public static int fallos = 0;
	public static int aciertos = 0;
	public static int z = 0;
	
	public static void main(String[] args) {
		
		String palabras[] = { "sistema operativo", "monitor", "teclado", "raton", "portatil", "programa",
				"base de datos", "ethernet", "hdmi", "usb", "ordenador", "videojuego", "entorno de desarrollo",
				"interfaz de audio", "placa base", "tarjeta de red", "tarjeta grafica", "gabinete", "ide", "usb",
				"programacion", "eclipse", "java", "ftp", "vpn", "multiplexor", "transistor", "puerta logica",
				"logica booleana", "binario", "decimal", "hexadecimal", "octal", "eclipse", "vga",
				"unidad aritmetico logica", "microprocesador", "ram", "ransomware", "antivirus", "troyano",
				"multiplexacion" };
		int index = (int) (Math.random() * palabras.length);
		int longitud = palabras[index].length();
		
//		boolean repetido = false;
		
		boolean arraybooleano[] = new boolean[longitud];
//		String intentos[] = new String[10];
		
		for (int i = 0; i < longitud; i++) {
			if(palabras[index].charAt(i) == ' ') {
				arraybooleano[i] = true;
			}else {
				arraybooleano[i] = false;
			}
		}
		
		Scanner teclado = new Scanner(System.in);
		
		while(!Ahorcado_V2.fin) {
			
			Limpiar();
			cabecera();
			
			dibujarmuñeco(longitud);
			
			dibujarpalabra(index, palabras, arraybooleano, longitud);
			
//			dibujarintentos(intentos, repetido);

			do {
				
				if (Ahorcado_V2.letra.length() != longitud && Ahorcado_V2.letra.length() != 1) {
					
					Limpiar();
					cabecera();
					dibujarmuñeco(longitud);
					dibujarpalabra(index, palabras, arraybooleano, longitud);
//					dibujarintentos(intentos, repetido);
					
					System.out.print(coloresconsola.BANANA_YELLOW + "\n\nEL NUMERO DE CARACTERES NO COINCIDE CON LA PALABRA, INTRODUZCA DE NUEVO SU LETRA (A - Z): " + coloresconsola.LIGHT_GREEN);
					Ahorcado_V2.letra = teclado.nextLine().toLowerCase();
					System.out.print(coloresconsola.RESET);
					
				}else {
					System.out.print(coloresconsola.BANANA_YELLOW + "\n\nINTRODUCE TU LETRA (A - Z): " + coloresconsola.LIGHT_GREEN);
					Ahorcado_V2.letra = teclado.nextLine().toLowerCase();
					System.out.print(coloresconsola.RESET);
				}
				
			} while (Ahorcado_V2.letra.length() != longitud && Ahorcado_V2.letra.length() != 1);
			
			comprobarpalabra(index, palabras, arraybooleano, longitud);
			
//			repetido = false;
//			for (int i = 0; i < 10; i++) {
//				if ((intentos[i]) == (Ahorcado_V2.letra)) {
//					repetido = true;
//				}
//			}
			
			comprobarfin (longitud, arraybooleano) ;
				
		}
		
		if (Ahorcado_V2.victoria) {
			victoria(index, palabras);
		}else {
			derrota(index, palabras);
		}
		
		teclado.close();
	}

	public static void cabecera() {
		
		System.out.print(coloresconsola.BANANA_YELLOW + "Hecho por: Ricardo de Antonio Aguirre" + coloresconsola.RESET);
		System.out.print(coloresconsola.TEAL + "\n============================================================================================= \r\n"
											+ "|     :::     :::    :::  ::::::::  :::::::::   ::::::::      :::     :::::::::   ::::::::  | \r\n"
											+ "|   :+: :+:   :+:    :+: :+:    :+: :+:    :+: :+:    :+:   :+: :+:   :+:    :+: :+:    :+: | \r\n"
											+ "|  +:+   +:+  +:+    +:+ +:+    +:+ +:+    +:+ +:+         +:+   +:+  +:+    +:+ +:+    +:+ | \r\n"
											+ "| +#++:++#++: +#++:++#++ +#+    +:+ +#++:++#:  +#+        +#++:++#++: +#+    +:+ +#+    +:+ | \r\n"
											+ "| +#+     +#+ +#+    +#+ +#+    +#+ +#+    +#+ +#+        +#+     +#+ +#+    +#+ +#+    +#+ | \r\n"
											+ "| #+#     #+# #+#    #+# #+#    #+# #+#    #+# #+#    #+# #+#     #+# #+#    #+# #+#    #+# | \r\n"
											+ "| ###     ### ###    ###  ########  ###    ###  ########  ###     ### #########   ########  | \r\n" 
											+ "============================================================================================= \r\n" + coloresconsola.RESET);
	}
	
	public static void dibujarmuñeco(int longitud) {

		switch (Ahorcado_V2.fallos) {

			case 0:
				System.out.println(coloresconsola.BROWN + " ___________.._______					\r\n"
								 + "| .__________))______|					\r\n"
								 + "| | / /      ||							\r\n"
								 + "| |/ /       ||							\r\n"
								 + "| | /        ||							\r\n"
								 + "| |/         ||							\r\n"
								 + "| |          ||							\r\n"
								 + "| |          							\r\n"
								 + "| |         							\r\n"
								 + "| |        								\r\n"
								 + "| |       								\r\n"
								 + "| |      								\r\n"
								 + "| |     								\r\n"
								 + "| |          							\r\n"
								 + "| |          							\r\n"
								 + "| |          							\r\n"
								 + "| |          							\r\n"
								 + "| |         							\r\n"
								 + "\"\"\"\"\"\"\"\"\"\"|_        |\"\"\"|	\r\n"
								 + "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
								 + "| |        \\ \\        | |				\r\n"
								 + ": :         \\ \\       : :  			\r\n"
								 + ". .          `'       . .					" + coloresconsola.RESET);
				break;
	
			case 1:
				System.out.println(coloresconsola.BROWN + " ___________.._______				\r\n"
								 + "| .__________))______|					\r\n"
								 + "| | / /      ||							\r\n"
								 + "| |/ /       ||							\r\n"
								 + "| | /        ||"+coloresconsola.RESET+".-''.					\r\n"
								 + coloresconsola.BROWN+"| |/         |"+coloresconsola.RESET+"/  _  \\					\r\n"
								 + coloresconsola.BROWN+"| |          ||"+coloresconsola.RESET+"  `/,|				\r\n"
								 + coloresconsola.BROWN+"| |          (\\\\"+coloresconsola.RESET+"`_.'					\r\n"
								 + coloresconsola.BROWN+"| |         							\r\n"
								 + "| |        								\r\n"
								 + "| |        	 							\r\n"
								 + "| |        	  							\r\n"
								 + "| |        	   							\r\n"
								 + "| |          							\r\n"
								 + "| |           							\r\n"
								 + "| |           							\r\n"
								 + "| |           							\r\n"
								 + "| |          							\r\n"
								 + "\"\"\"\"\"\"\"\"\"\"|_        |\"\"\"|	\r\n"
								 + "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
								 + "| |        \\ \\        | |				\r\n"
								 + ": :         \\ \\       : :  			\r\n"
								 + ". .          `'       . .					");
				break;
	
			case 2:
				System.out.println(coloresconsola.BROWN + " ___________.._______					\r\n"
								 + "| .__________))______|					\r\n"
								 + "| | / /      ||							\r\n"
								 + "| |/ /       ||							\r\n"
								 + "| | /        ||"+coloresconsola.RESET+".-''.					\r\n"
								 + coloresconsola.BROWN+"| |/         |"+coloresconsola.RESET+"/  _  \\\\				\r\n"
								 + coloresconsola.BROWN+"| |          ||"+coloresconsola.RESET+"  `/,|					\r\n"
								 + coloresconsola.BROWN+"| |          (\\\\"+coloresconsola.RESET+"`_.'				\r\n"
								 + coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+".-`--'.						\r\n"
								 + coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+"Y . . Y						\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|   | 						\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"| . |  						\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|   |   					\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|_'_|						\r\n"
								 + coloresconsola.BROWN+"| |           							\r\n"
								 + "| |           							\r\n"
								 + "| |           							\r\n"
								 + "| |          							\r\n"
								 + "\"\"\"\"\"\"\"\"\"\"|_        |\"\"\"|	\r\n"
								 + "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
								 + "| |        \\ \\        | |				\r\n"
								 + ": :         \\ \\       : :  			\r\n"
								 + ". .          `'       . .					" + coloresconsola.RESET);
				break;
			case 3:
				System.out.println(coloresconsola.BROWN+" ___________.._______					\r\n"
								 + "| .__________))______|					\r\n"
								 + "| | / /      ||							\r\n"
								 + "| |/ /       ||							\r\n"
								 + "| | /        ||"+coloresconsola.RESET+".-''.					\r\n"
								 + coloresconsola.BROWN+"| |/         |"+coloresconsola.RESET+"/  _  \\					\r\n"
								 + coloresconsola.BROWN+"| |          ||"+coloresconsola.RESET+"  `/,|					\r\n"
								 + coloresconsola.BROWN+"| |          (\\\\"+coloresconsola.RESET+"`_.'					\r\n"
								 + coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+".-`--'.						\r\n"
								 + coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+"Y . . Y"+coloresconsola.RESET+"\\					\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|   | "+coloresconsola.RESET+"\\\\					\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"| . |  "+coloresconsola.RESET+"\\\\					\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|   |   "+coloresconsola.RESET+"(`					\r\n"
								 + coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|_'_|						\r\n"
								 + coloresconsola.BROWN+"| |           							\r\n"
								 + "| |           							\r\n"
								 + "| |           							\r\n"
								 + "| |          							\r\n"
								 + "\"\"\"\"\"\"\"\"\"\"|_        |\"\"\"|	\r\n"
								 + "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
								 + "| |        \\ \\        | |				\r\n"
								 + ": :         \\ \\       : :  			\r\n"
								 + ". .          `'       . .					"+coloresconsola.RESET);
				break;
	
			case 4:
				System.out.println(coloresconsola.BROWN+" ___________.._______					\r\n"
												 + "| .__________))______|					\r\n"
												 + "| | / /      ||							\r\n"
												 + "| |/ /       ||							\r\n"
												 + "| | /        ||"+coloresconsola.RESET+".-''.					\r\n"
							+ coloresconsola.BROWN+"| |/         |"+coloresconsola.RESET+"/  _  \\					\r\n"
							+ coloresconsola.BROWN+"| |          ||"+coloresconsola.RESET+"  `/,|					\r\n"
							+ coloresconsola.BROWN+"| |          (\\\\"+coloresconsola.RESET+"`_.'					\r\n"
							+ coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+".-`--'.						\r\n"
							+ coloresconsola.BROWN+"| |        "+coloresconsola.RESET+"/"+coloresconsola.ORANGE+"Y . . Y"+coloresconsola.RESET+"\\					\r\n"
							+ coloresconsola.BROWN+"| |       "+coloresconsola.RESET+"// "+coloresconsola.ORANGE+"|   | "+coloresconsola.RESET+"\\\\					\r\n"
							+ coloresconsola.BROWN+"| |      "+coloresconsola.RESET+"//  "+coloresconsola.ORANGE+"| . |  "+coloresconsola.RESET+"\\\\				\r\n"
							+ coloresconsola.BROWN+"| |     "+coloresconsola.RESET+"')   "+coloresconsola.ORANGE+"|   |   "+coloresconsola.RESET+"(`					\r\n"
							+ coloresconsola.BROWN+"| |          "+coloresconsola.ORANGE+"|_'_|						\r\n"
							+ coloresconsola.BROWN+"| |           							\r\n"
												 + "| |           							\r\n"
												 + "| |           							\r\n"
												 + "| |          							\r\n"
												 + "\"\"\"\"\"\"\"\"\"\"|_        |\"\"\"|	\r\n"
												 + "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
												 + "| |        \\ \\        | |				\r\n"
												 + ": :         \\ \\       : :  			\r\n"
												 + ". .          `'       . .					"+coloresconsola.RESET);
				break;
	
			case 5:
				System.out.println(coloresconsola.BROWN+" ___________.._______					\r\n"
													 + "| .__________))______|					\r\n"
													 + "| | / /      ||							\r\n"
													 + "| |/ /       ||							\r\n"
													 + "| | /        ||"+coloresconsola.RESET+".-''.					\r\n"
								+ coloresconsola.BROWN+"| |/         |"+coloresconsola.RESET+"/  _  \\					\r\n"
								+ coloresconsola.BROWN+"| |          ||"+coloresconsola.RESET+"  `/,|					\r\n"
								+ coloresconsola.BROWN+"| |          (\\\\"+coloresconsola.RESET+"`_.'					\r\n"
								+ coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+".-`--'.						\r\n"
								+ coloresconsola.BROWN+"| |        "+coloresconsola.RESET+"/"+coloresconsola.ORANGE+"Y . . Y"+coloresconsola.RESET+"\\					\r\n"
								+ coloresconsola.BROWN+"| |       "+coloresconsola.RESET+"// "+coloresconsola.ORANGE+"|   | "+coloresconsola.RESET+"\\\\					\r\n"
								+ coloresconsola.BROWN+"| |      "+coloresconsola.RESET+"//  "+coloresconsola.ORANGE+"| . |  "+coloresconsola.RESET+"\\\\				\r\n"
								+ coloresconsola.BROWN+"| |     "+coloresconsola.RESET+"')   "+coloresconsola.ORANGE+"|   |   "+coloresconsola.RESET+"(`					\r\n"
								+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"||'_|						\r\n"
								+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"|| 						\r\n"
								+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"|| 						\r\n"
								+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"|| 						\r\n"
								+ coloresconsola.BROWN+"| |         "+coloresconsola.RED+"/ | 						\r\n"
								+ coloresconsola.BROWN+"\"\"\"\"\"\"\"\"\"\"|_"+coloresconsola.RED+"`-'     "+coloresconsola.BROWN+"|\"\"\"|	\r\n"
								+ coloresconsola.BROWN+"|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
													+ "| |        \\ \\        | |				\r\n"
													+ ": :         \\ \\       : :  			\r\n"
													+ ". .          `'       . .					"+coloresconsola.RESET);
				break;
	
			case 6:
				System.out.println(coloresconsola.BROWN+" ___________.._______					\r\n"
						 + "| .__________))______|					\r\n"
						 + "| | / /      ||							\r\n"
						 + "| |/ /       ||							\r\n"
						 + "| | /        ||"+coloresconsola.RESET+".-''.					\r\n"
	+ coloresconsola.BROWN+"| |/         |"+coloresconsola.RESET+"/  _  \\					\r\n"
	+ coloresconsola.BROWN+"| |          ||"+coloresconsola.RESET+"  `/,|					\r\n"
	+ coloresconsola.BROWN+"| |          (\\\\"+coloresconsola.RESET+"`_.'					\r\n"
	+ coloresconsola.BROWN+"| |         "+coloresconsola.ORANGE+".-`--'.						\r\n"
	+ coloresconsola.BROWN+"| |        "+coloresconsola.RESET+"/"+coloresconsola.ORANGE+"Y . . Y"+coloresconsola.RESET+"\\		\r\n"
	+ coloresconsola.BROWN+"| |       "+coloresconsola.RESET+"// "+coloresconsola.ORANGE+"|   | "+coloresconsola.RESET+"\\\\	\r\n"
	+ coloresconsola.BROWN+"| |      "+coloresconsola.RESET+"//  "+coloresconsola.ORANGE+"| . |  "+coloresconsola.RESET+"\\\\	\r\n"
	+ coloresconsola.BROWN+"| |     "+coloresconsola.RESET+"')   "+coloresconsola.ORANGE+"|   |   "+coloresconsola.RESET+"(`	\r\n"
	+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"||'||						\r\n"
	+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"|| ||						\r\n"
	+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"|| ||						\r\n"
	+ coloresconsola.BROWN+"| |          "+coloresconsola.CYAN+"|| ||						\r\n"
	+ coloresconsola.BROWN+"| |        "+coloresconsola.RED+" / | | \\					\r\n"
	+ coloresconsola.BROWN+"\"\"\"\"\"\"\"\"\"\"|_"+coloresconsola.RED+"`-' `-'"+coloresconsola.BROWN+"|\"\"\"|	\r\n"
	+ coloresconsola.BROWN+"|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|	\r\n"
	+ "| |        \\ \\        | |				\r\n"
	+ ": :         \\ \\       : :  			\r\n"
	+ ". .          `'       . .					"+coloresconsola.RESET);
				break;

		}
	}

	public static void dibujarpalabra(int index, String[] palabras, boolean[] arraybooleano, int longitud) {
		
		System.out.print(coloresconsola.YELLOW_UNDERLINED + "\nPALABRA" + coloresconsola.RESET + ": ");
		for (int i = 0; i < longitud; i++) {
	
			if (arraybooleano[i]) {
				System.out.print(coloresconsola.LIGHT_PINK + palabras[index].charAt(i) + coloresconsola.RESET + " ");
			} else if (palabras[index].charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print("_" + " ");
			}
		}
		
	}
	
	public static void comprobarpalabra(int index, String[] palabras, boolean[] arraybooleano, int longitud) {
		
		Ahorcado_V2.control = false;
		
			for (int i = 0; i < longitud; i++) {
				
				if (Ahorcado_V2.letra.length() == 1 && Ahorcado_V2.letra.charAt(0) == palabras[index].charAt(i)) {
					arraybooleano[i] = true;
					Ahorcado_V2.control = true;
				}else if (Ahorcado_V2.letra.length() != 1 && Ahorcado_V2.letra.charAt(i) == palabras[index].charAt(i)) {
					arraybooleano[i] = true;
				}
			}
		
		if (!Ahorcado_V2.control) {
			Ahorcado_V2.fallos++;
		}
	}

//	public static void dibujarintentos (String[] intentos, boolean repetido) {
//		
//		System.out.print("\n\nIntentos: ");
//		
//		if (!repetido && Ahorcado_V2.letra != " ") {
//			intentos [Ahorcado_V2.z] = Ahorcado_V2.letra;
//			Ahorcado_V2.z ++;
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			if (intentos[i] != null) {
//				System.out.print(intentos[i] + " ");
//			}
//		}
//		
//	}

	public static void comprobarfin(int longitud, boolean[] arraybooleano) {
		
		for (int i = 0; i < longitud; i++) {
			if (!arraybooleano[i]) {
				break;
			}else if(i == longitud - 1) {
				Ahorcado_V2.victoria = true;
				Ahorcado_V2.fin = true; 
			}
		}
		
		if (Ahorcado_V2.fallos > 6) {
			Ahorcado_V2.victoria = false;
			Ahorcado_V2.fin = true; 
		}
	}
	
	public static void victoria(int index, String[] palabras) {
		Limpiar();
		System.out.println(coloresconsola.LIGHT_GREEN+",---.  ,---..-./`)     _______ ,---------.    ,-----.    .-------.   .-./`)    ____     \r\n"
						 							 + "|   /  |   |\\ .-.')   /   __  \\\\          \\ .'  .-,  '.  |  _ _   \\  \\ .-.') .'  __ `.  \r\n"
						 							 + "|  |   |  .'/ `-' \\  | ,_/  \\__)`--.  ,---'/ ,-.|  \\ _ \\ | ( ' )  |  / `-' \\/   '  \\  \\ \r\n"
						 							 + "|  | _ |  |  `-'`\"`,-./  )         |   \\  ;  \\  '_ /  | :|(_ o _) /   `-'`\"`|___|  /  | \r\n"
						 							 + "|  _( )_  |  .---. \\  '_ '`)       :_ _:  |  _`,/ \\ _/  || (_,_).' __ .---.    _.-`   | \r\n"
						 							 + "\\ (_ o._) /  |   |  > (_)  )  __   (_I_)  : (  '\\_/ \\   ;|  |\\ \\  |  ||   | .'   _    | \r\n"
						 							 + " \\ (_,_) /   |   | (  .  .-'_/  ) (_(=)_)  \\ `\"/  \\  ) / |  | \\ `'   /|   | |  _( )_  | \r\n"
						 							 + "  \\     /    |   |  `-'`-'     /   (_I_)    '. \\_/``\".'  |  |  \\    / |   | \\ (_ o _) / \r\n"
						 							 + "   `---`     '---'    `._____.'    '---'      '-----'    ''-'   `'-'  '---'  '.(_,_).'  \r\n"
						 							 + "                                                                                        "+coloresconsola.RESET);
		System.out.print("\n\nLa palabra correcta es: " + coloresconsola.LIGHT_GREEN + palabras[index].toUpperCase() + coloresconsola.RESET + " Enhorabuena");
	}
	
	public static void derrota(int index, String[] palabras) {
		Limpiar();
		System.out.println(coloresconsola.RED+":::::::::  :::::::::: :::::::::  :::::::::   :::::::: ::::::::::: :::     \r\n"
											 + ":+:    :+: :+:        :+:    :+: :+:    :+: :+:    :+:    :+:   :+: :+:   \r\n"
											 + "+:+    +:+ +:+        +:+    +:+ +:+    +:+ +:+    +:+    +:+  +:+   +:+  \r\n"
											 + "+#+    +:+ +#++:++#   +#++:++#:  +#++:++#:  +#+    +:+    +#+ +#++:++#++: \r\n"
											 + "+#+    +#+ +#+        +#+    +#+ +#+    +#+ +#+    +#+    +#+ +#+     +#+ \r\n"
											 + "#+#    #+# #+#        #+#    #+# #+#    #+# #+#    #+#    #+# #+#     #+# \r\n"
											 + "#########  ########## ###    ### ###    ###  ########     ### ###     ### " + coloresconsola.RESET);
		
		System.out.print("\n\nLa palabra correcta era: " + coloresconsola.LIGHT_GREEN + palabras[index].toUpperCase() + coloresconsola.RESET);
	}
	
	
	public static void Limpiar() {

		try {

			if (System.getProperty("os.name").contains("Windows"))

				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			else

				Runtime.getRuntime().exec("clear");

		} catch (IOException | InterruptedException ex) {
		}
	}
	
}


