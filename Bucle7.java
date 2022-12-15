import java.util.Scanner;
public class Bucle7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int intentos = 4;
    int clave;
    boolean acertado = false;
    do {
    System.out.print("Introduzca la clave de la caja fuerte: ");
    clave=s.nextInt();
    if (clave == 2424) {
    acertado = true;
    } else {
    System.out.println("Clave incorrecta");
    } intentos--; } while((intentos > 0) && (!acertado));
        if (acertado) {
        System.out.println("Ha abierto la caja fuerte.");
        } else {
        System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
}
