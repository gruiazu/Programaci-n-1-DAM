package JAVA.Capítulo3;
public class Lectura1 {
    public static void main(String[] args) { 
        String n1;
        String n2;
System.out.print("Por favor, dime un número: ");
n1 = System.console().readLine();
int primerNumero;
primerNumero = Integer.parseInt( n1 );
System.out.print("Por favor, dime otro número: ");
n2 = System.console().readLine();
int segundoNumero;
segundoNumero = Integer.parseInt( n2 );
int total;
total= primerNumero*segundoNumero;
System.out.println("La multiplicación de los números que me has dicho es: " + total);
}
}