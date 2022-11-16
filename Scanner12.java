package JAVA.Capítulo3;
import java.util.Scanner;

public class Scanner12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double n1=s.nextDouble();
        System.out.print("¿Que nota quieres sacar en el trimestre? ");
        double n2=s.nextDouble();
        double b1=n1*40/100;
        double n3=n2*2-b1;
        double n4=n3*60/100;
        System.out.println("Para tener un "+n2+" en e trimestre necesitas sacar un "+n4+" en el segundo exámen");
    }
}
