import java.util.Scanner;

public class Ejercicio_Guille {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int notas = sc.nextInt();
        int corte = sc.nextInt();
        int contador = 0;
        int array[] = new int[notas];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] >= corte) {
                contador++;

            }

        }
        System.out.println(contador);
        sc.close();
        System.out.println("Fin del programa");

    }
}