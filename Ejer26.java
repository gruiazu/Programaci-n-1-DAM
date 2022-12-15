
import java.util.Scanner;
public class Ejer26 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Venta de entradas CineCampa");
    System.out.print("Introduzca el numero de entradas que quiere ");
    int entradas=s.nextInt();
    System.out.print("Que día de la semana las quiere ");
    String dia=System.console().readLine();
    System.out.print("¿Tiene tarjeta CineCampa? (Escriba si o no): ");
    String tarjeta=System.console().readLine();
    int entradas1=entradas;
    double precioEntrada1=8;
    int entradas2 = 0;
    double total = 0;
    double descuento = 0;
    double Precio = 0;

    switch (dia) {
        case "miércoles":
        precioEntrada1 = 5;

        case "jueves":
        entradas2 = entradas / 2;
        entradas1 = entradas % 2;
        default:
    }
    total = precioEntrada1 * entradas1;
    total += 11 * entradas2;
    if(tarjeta.equals("si")) {
      descuento = total * 0.1;
    }
    Precio = total - descuento;
    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

    if (entradas2 > 0) {
        System.out.printf("Entradas de pareja            "+entradas2);
        System.out.printf("Precio por entrada de pareja  11");
    } if (entradas1 > 0) {
        System.out.printf("Entradas individuales         "+ entradas1);
        System.out.printf("Precio por entrada individual "+ precioEntrada1);
    }
    System.out.printf("Total                         "+ total);
    System.out.printf("Descuento                     "+ descuento);
    System.out.printf("A pagar                       "+ Precio);
    }
}