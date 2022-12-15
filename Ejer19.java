import java.util.Scanner;
public class Ejer19 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        int num=s.nextInt();
        int dig=0;
        if ( num < 10 ) {
        dig = 1;
        }
        
        if (( num >= 10 ) && ( num < 100 )) {
        dig=2;
        }
        
        if (( num>= 100 ) && ( num < 1000 )) {
        dig=3;
        }
        
        if (( num >= 1000 ) && ( num < 10000 )) {
        dig=4;
        }
        
        if (( num >= 10000 ) && ( num < 10000)) {
        dig=5;
        } if (num >= 100000) {
            System.out.println("El número introducido no es válido, recuerda que tiene que ser de 1 a 5 cifras");
        }
        
        if (dig == 1) {
        System.out.println("El número introducido tiene 1 dígito.");
        } else {
        System.out.println("El número introducido tiene " + dig + " dígitos.");
        }
    }
}

