package JAVA.Capítulo3;
import java.util.Scanner;
public class Scanner9 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduzca primero el radio de la base del cono, seguido de la altura ");
    double radio=s.nextDouble();
    double altura=s.nextDouble();
    double pi=3.14;
    double volumen=(pi*radio*radio*altura)/3;
    System.out.println("El volumen del cono sería "+volumen);
    }
}
