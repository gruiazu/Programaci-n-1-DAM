package JAVA.Capítulo4;
import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduzca las notas de los 3 exámenes ");
    double n1=s.nextDouble();
    double n2=s.nextDouble();
    double n3=s.nextDouble();
    double total=(n1+n2+n3)/3;
    System.out.println("La media de tu nota es "+total);
    }    
}
