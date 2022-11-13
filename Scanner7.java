package JAVA.Capítulo3;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca la base imponible ");
        int base=s.nextInt();
        int IVA=base*21/100;
        int total=base-IVA;
        System.out.println("La factura total es de "+total);
    }
}
