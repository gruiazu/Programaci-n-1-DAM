package JAVA.Capítulo4;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de orimer grado del tipo ax + b= 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a=s.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        double b=s.nextDouble();
        if ((a<0) || (a>0)) {
            double x= -b/a;
        } else if
         (b==0) {
            double x=0;
            System.out.println("x = "+x);
         }
        else {
            System.out.println("Esa ecuación no tiene solución real");
        }
    }
}
