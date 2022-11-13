package JAVA.Capítulo3;

import java.util.Scanner;

public class Scanner6 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Escriba la base del triángulo ");
        int base=s.nextInt();
        System.out.print("Escriba la altura del triángulo ");
        int altura=s.nextInt();
        int area =(base*altura)/2;
        System.out.println("El área del triángulo es "+area);
    }
}
