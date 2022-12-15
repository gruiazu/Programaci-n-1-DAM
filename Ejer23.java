import java.util.Scanner;
public class Ejer23 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce la base imponible ");
    double BI=s.nextDouble();
    System.out.print("Introduce el tipo de IVA (general, reducido o superreducido) ");
    String IVA = System.console().readLine();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codP = System.console().readLine();
    int IVAporcent = 0; 
    switch(IVA) {
        case "general":
            IVAporcent = 21;
            break;

        case "reducido":
            IVAporcent = 10;
            break;

        case "superreducido":
            IVAporcent = 4;
            break;

        default:
            System.out.println("El tipo de IVA introducido no es correcto.");
        }
        double IVAtotal = BI * IVAporcent / 100;
        double PrecioI = BI + IVAtotal;
        double descuento = 0;
        switch(codP) {
        case "nopro":
            break;

        case "mitad": 
            descuento = PrecioI / 2;
            break;

        case "meno5":
            descuento = 5;
            break;

        case "5porc": 
            descuento = PrecioI * 0.05;
            break;
            
        default:
            System.out.println("El código promocional introducido no es correcto.");
        }
        double total = PrecioI - descuento;
        System.out.println("Base imponible       "+BI);
        System.out.println("IVA                  "+IVAtotal);
        System.out.println("Precio con IVA       "+PrecioI);
        System.out.println("Cód. promo (mitad)   "+ descuento);
        System.out.println("TOTAL                "+total);
    }
    }

