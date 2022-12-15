import java.util.Scanner;
public class Ejer25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en cm: ");
        double altura=s.nextDouble();
        System.out.print("Ahora introduzca la anchura: ");
        double anchura=s.nextDouble();
        System.out.print("¿Quiere escudo bordado? (Escriba si o no) ");
        String Escudo=System.console().readLine();
        double precioEscudo=0;
        double total;
        if (Escudo.equals("si")) {
        precioEscudo = 2.50;
        } if (Escudo.equals("no")) {
        precioEscudo = 0;
        }
        total=altura*anchura/100+precioEscudo;
        System.out.println("La bandera costaría "+total+" €");
    }
}
