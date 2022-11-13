package JAVA.Capítulo3;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca dos números ");
int n1=s.nextInt();
int n2=s.nextInt();
int multi=n1*n2;
System.out.println("Su multiplicación es "+multi);
    }
}
