package JAVA.Capítulo3;

public class Lectura2 {
    public static void main(String[] args) {
String entrada;
System.out.print("Dime cuantos euros quieres pasar a pesetas ");
entrada = System.console().readLine();
int euros= Integer.parseInt(entrada);
int pesetas;
pesetas= euros*166;
System.out.println("En total serían "+pesetas);
    }
}
