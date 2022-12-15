import java.util.Scanner;
public class Bucle8 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
        int num=s.nextInt();
        for (int i = 0; i <= 10; i++) {
          System.out.println(num * i);
        }
}
}
