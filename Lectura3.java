package JAVA.Capítulo3;

public class Lectura3 {
    public static void main(String[] args) {
String linea;
System.out.print("Cuantas pesetas quieres pasar a euros ");
linea =System.console().readLine();
double pesetas;
pesetas = Double.parseDouble(linea);
double euros= pesetas/166.386;
System.out.println("En euros serían "+euros);
    }  
}
