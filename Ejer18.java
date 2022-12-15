import java.util.Scanner;
public class Ejer18 {
    
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce un número entero positivo (5 cifras como máximo) ");
    int num=s.nextInt();
    int resul=0;
    if ( num < 10 ) {
        resul = num;
    }
    
    if (( num >= 10 ) && ( num < 100 )) {
        resul = num/10;
    }
    
    if (( num >= 100 ) && ( num < 1000 )) {
        resul = num / 100;
    }
    
    if (( num >= 1000 ) && ( num < 10000 )) {
        resul = num / 1000;
    }
    
    if (( num >= 10000 ) && ( num < 100000)) {
        resul = num / 10000;
    } if ( num >= 100000) {
        System.out.println("El número introducido no es válido, por favor recuerde introducir uno de 5 dígitos o menos");
    }
    System.out.println("La primera cifra del número introducido es el " + resul);
    }
}

