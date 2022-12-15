import java.util.Scanner;
public class Ejer17 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.print("Introduce un número ");
        int num=s.nextInt();
        int resul=num%10;
        System.out.println("La última cifra del número introducido es el " +resul);
    }
}
