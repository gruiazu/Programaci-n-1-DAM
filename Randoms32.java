package Capitulo6;
import java.util.Scanner;
public class Randoms32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitud = sc.nextInt();

        // Pintar la primera línea del sendero
        System.out.println("|  |");
        
        // Pintar las líneas restantes del sendero
        for (int i = 1; i < longitud; i++) {
            // Generar un número aleatorio para decidir la dirección del sendero
            int direccion = (int)(Math.random()*3+1);
            
            // Pintar los bordes de la línea
            System.out.print("|");
            
            // Pintar los obstáculos (si los hay)
            int obstaculo = (int)(Math.random()*2); // 0: ninguno, 1: planta u obstáculo
            int posicionObstaculo = (int)(Math.random()*3); // 0 a 3 (posiciones disponibles)
            if (obstaculo == 1) {
                if (posicionObstaculo == 0) {
                    System.out.println(" * |");
                } else if (posicionObstaculo == 1) {
                    System.out.println("| * ");
                } else if (posicionObstaculo == 2) {
                    System.out.println("| O ");
                } else {
                    System.out.print(" O |");
                }
            } else {
                System.out.print("   |");
            }
            
            // Pintar los espacios del sendero
            if (direccion == 0) { // recto
                System.out.println("  |");
            } else if (direccion == 1) { // izquierda
                System.out.println("   |");
            } else { // derecha
                System.out.println("|  ");
            }
        }
        
        // Pintar el final del sendero
        System.out.println("|  |");
        
        sc.close();
    }
}
