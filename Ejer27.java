import java.util.Scanner;
public class Ejer27 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor=System.console().readLine();
    double precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;
    String tipoChocolate = "";
    switch (sabor) {
    case "manzana":
        precioSabor = 18;
        break;

    case "fresa":
        precioSabor = 16;
        break;

    case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate=System.console().readLine();
        if (tipoChocolate.equals("negro")) {
        precioSabor = 14;
        } if (tipoChocolate.equals("blanco")) {
        precioSabor = 15;
        }
        break;
    default:
    }
    System.out.print("¿Quiere nata? (si o no): ");
    String Nata=System.console().readLine();
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    String Nombre=System.console().readLine();
    System.out.print("Tarta de " + sabor);
    if (sabor.equals("chocolate")) {
    System.out.print(" " + tipoChocolate);
    }
    if (Nata.equals("si")) {
    precioNata = 2.5;
    System.out.println(" con nata: "+ precioNata);
    }
    if (Nombre.equals("si")) {
    precioNombre = 2.75;
    System.out.println("con nombre: "+ precioNombre);
    }
    int total=(int) (precioSabor + precioNata + precioNombre);
    System.out.println("Total: "+total);
}

}
