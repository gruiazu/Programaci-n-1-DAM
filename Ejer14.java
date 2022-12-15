import java.util.Scanner; 
public class Ejer14 {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Introduzca un número ");
int num=s.nextInt();
int resto=num%2;
int div=num%5;
if (resto == 0) {
    System.out.println("El numero introducido es par");
} if (resto != 0) {
    System.out.println("El numero introducido es impar");
} if (div == 0) {
    System.out.print("El número introducido es divisible por 5");
} if (div != 0) {
    System.out.print("El número introducido no es divisible por 5");
    }
}
}