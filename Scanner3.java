package JAVA.Capítulo3;
import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Introduzca la cantidad en pesetas que quiera pasar a euros ");
int pesetas=s.nextInt();
int total=pesetas/166;
System.out.println("La cantidad en euros sería "+total+" euros");
    }
}
