package JAVA.Capítulo3;

public class Lectura6 {
    public static void main(String[] args) {
String n1;
String n2;
System.out.print("Escriba la base del triángulo ");
n1 =System.console().readLine();
int base =Integer.parseInt(n1);
System.out.print("Escriba la altura del triángulo ");
n2 =System.console().readLine();
int altura =Integer.parseInt(n2);
int area =(base*altura)/2;
System.out.println("El área del triángulo es "+area);
    } 
}
