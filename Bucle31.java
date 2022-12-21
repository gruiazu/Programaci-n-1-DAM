import java.util.Scanner;
public class Bucle31 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduzca la altura de la L ");
    int alt =s.nextInt();
    for (int l = 1; l < alt; l++) {
    System.out.println("*");
        }
    for (int l = 0; l < alt / 2 + 1; l++) {
    System.out.print("* ");
        }
}
}
