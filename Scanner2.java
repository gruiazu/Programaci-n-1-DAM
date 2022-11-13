package JAVA.Capítulo3;
import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Introduzca la cantidad en euros que quiera pasar a pesetas ");
int euros=s.nextInt();
int total=euros*166;
System.out.println("La cantidad en pesetas sería "+total);
    }
}
