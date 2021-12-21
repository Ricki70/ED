
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

public class Texto_ASCII {

    public static void main(String[] args) throws IOException {

        int ancho = 236;
        int alto = 300;
        Scanner cadena = new Scanner(System.in);
        System.out.println("Ingrese el texto a imprimir: ");
        String texto = cadena.nextLine();
        
        BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        Graphics graficos = imagen.getGraphics();
        graficos.setFont(new Font("ComicSans", Font.BOLD, 30));

        Graphics2D graficos2D = (Graphics2D) graficos;
        graficos2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graficos2D.drawString(texto, 1, 20);

        for (int y = 0; y < alto; y++) {
            StringBuilder montajecadena = new StringBuilder();
            for (int x = 0; x < ancho; x++) {

            	montajecadena.append(imagen.getRGB(x, y) == -16777216 ? " " : "|");

            }

            if (montajecadena.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(montajecadena);
        }
        
        cadena.close();
    }

}