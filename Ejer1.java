package JAVA.Capítulo4;
import java.util.Scanner;

public class Ejer1 {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce el numero del día de la semana de lunes a viernes ");
    int dia=s.nextInt();
    switch (dia) {
        case 1:
        System.out.println("El lunes a primera hora hay sistemas informáticos");
        break;

        case 2:
        System.out.println("El martes a primera hora hay programación");
        break;

        case 3:
        System.out.println("El miércoles a primera hora hay sistemas informáticos");
        break;
        
        case 4:
        System.out.println("El jueves a primera hora hay programación");
        break;

        case 5:
        System.out.println("El jueves a primera hora hay programación");
        break;

        default:
        System.out.println("Lo siento la opción elegida no es correcta, asegurese de introducir un número del 1 al 5");
    }
    
}
}
