package JAVA.Capítulo3;

public class Lectura7 {
    public static void main(String[] args) {
String linea;
System.out.print("Escriba la base imponible ");
linea =System.console().readLine();
int base=Integer.parseInt(linea);
int IVA=base*21/100;
int total=base-IVA;
System.out.println("La factura total es de "+total);
    }
}
