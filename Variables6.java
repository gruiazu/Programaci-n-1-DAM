package JAVA;

public class Variables6 {
    public static void main(String[] args) {
int Factura;
int total= 200;
int IVA;
IVA= total*21/100;
Factura=total-IVA;
System.out.println("La base imponible es de 200 euros");
System.out.println("El precio final de la factura es "+Factura);
    }   
}
