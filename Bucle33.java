import java.util.Scanner;
public class Bucle33 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduzca la altura de la U: ");
    int alt=s.nextInt();
    for (int i = 1; i < alt; i++) {
        System.out.print("* ");
        for (int bas = 2; bas < alt; bas++) {
        System.out.print("  ");
        }
    System.out.println("*");
        }
    System.out.print("  ");
    for (int i = 2; i < alt; i++) {
        System.out.print("* ");
        }
    }
}
