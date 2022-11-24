package JAVA.Capítulo4;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca los números correspondientes a: a, b y c en una ecuacion de segundo grado (ax2+bx+c)");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double raiz=b*b-4*a*c;
        if (raiz<0) {
            System.out.println("No hay solución posible");
        } else { 
        double resul= Math.sqrt(raiz);
        double total=(-b+resul)/2*a;
        double total2=(-b-resul)/2*a;  
        System.out.println("Los resultados posibles para la ecuación son "+total+" y "+total2);
        }
    }
}
