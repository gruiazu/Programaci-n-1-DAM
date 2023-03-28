package Capitulo6;
import java.util.Scanner;

public class Randoms20 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = s.nextInt();
        int cantidadAgua = (int) (Math.random() * (capacidad + 1));
        int vacio= capacidad-cantidadAgua;
        System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + cantidadAgua + " litros de agua.");

        while (vacio!=0) {
            System.out.println("*    *");
            vacio--;
        }

        for (int i = 0; i != cantidadAgua; i++) {
            System.out.println("*====*");
        }


        System.out.println("******");
    }
}
