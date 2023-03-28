package Capitulo6;
import java.util.Scanner;

public class Randoms22 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = s.nextInt();

        // Imprimir cabeza
        System.out.println("            @");

        // Generar cuerpo de serpiente
        int posicion = 12;
        for (int i = 1; i < longitud; i++) {
            int movimiento = (int) (Math.random() * 3);
            if (movimiento == 0 && posicion > 0) {
                // Mover serpiente una posición a la izquierda
                posicion--;
            } else if (movimiento == 2 && posicion < 24) {
                // Mover serpiente una posición a la derecha
                posicion++;
            }
            // Imprimir serpiente en la posición actual
            for (int j = 0; j < posicion; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
