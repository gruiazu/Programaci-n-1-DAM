package JAVA.Capítulo3;

public class Lectura4 {
    public static void main(String[] args) {
String N1;
String N2;
System.out.print("Introduce un número ");
N1 = System.console().readLine();
int num1 =Integer.parseInt(N1);
System.out.print("Introduce otro ");
N2 =System.console().readLine();
int num2 =Integer.parseInt(N2);
int suma= num1+num2;
int resta= num1-num2;
int multi= num1*num2;
int divi= num1/num2;
System.out.println("El resultado de su suma es "+suma);
System.out.println("El resultado de su resta es "+resta);
System.out.println("El resultado de su multipliación es "+multi);
System.out.println("El resultado de su división es "+divi);
    }
}