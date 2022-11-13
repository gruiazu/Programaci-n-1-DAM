package JAVA.Capítulo3;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Escriba la base del rectángulo ");
        int base=s.nextInt();
        System.out.print("Escriba la altura del rectángulo ");
        int altura=s.nextInt();
        int área=base*altura;
        System.out.println("El área del rectángulo es "+área);
    }
}
