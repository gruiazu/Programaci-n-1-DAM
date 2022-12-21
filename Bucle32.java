import java.util.Scanner;
public class Bucle32 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce un número entero ");
    int num=s.nextInt();
    int x=num;
    int volt= 0;
    int longi= 0;
    if (x == 0) {
    longi = 1;
    }
    while (x > 0) {
    volt= (volt * 10) + (x % 10);
    x/= 10;
    longi++;
    } 
    System.out.println("Dígitos pares: ");
    int digito;
    int sumaPares = 0;
    for (int i = 0; i < longi; i++) {
    digito = (int)(volt% 10);
    if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
        }
    volt/= 10;
    }
    System.out.println("La suma de los dígitos pares es " + sumaPares);
    }
    }

