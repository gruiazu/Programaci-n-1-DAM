package JAVA.Capitulo7;
import java.util.Scanner;
public class Ejemp1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] x= new int[10];
        x[0] = 32;
        x[1] = 12;
        x[2] = 60;
        x[3] = 145;
        x[4] = 44;
        x[5] = 38;
        x[6] = 75;
        x[7] = 92;
        x[8] = 56;
        x[9] = 30;
        int i=0;
        while (i<10) {
        System.out.println("x["+i+"] = "+x[i]);
        i++;
        }
        System.out.print("Introduzca un número del 0 al 9 ");
        int num=s.nextInt(); 
        System.out.println("El número que se encuentra en la posición "+num+" es el "+x[num]);
        System.out.println("Las posiciones pares y su suma son: ");
        int y=4;
        int total=x[2];
        int resul=0;
        while (y<10) {
            resul=total+x[y];
            System.out.println(total+" + "+x[y]+" = "+resul);
            total=total+x[y];
            y++;
            y++;
        }
        System.out.println("El resultado de la suma de las posiciones pares es "+resul);
    }
}
