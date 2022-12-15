import java.util.Scanner;
public class Ejer20 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        boolean capicua = false;
        System.out.print("Introduce un número de 5 cifras como máximo ");
        int num=s.nextInt();
        if (num < 10) {
            capicua = true;
        }
        if ((num >= 10) && (num < 100)) {
        if ((num / 10) == (num % 10)) {
            capicua = true;
        }
        } if ((num >= 100) && (num < 1000)) {
        if ((num / 100) == (num % 10)) {
            capicua = true;
        }
        } if ((num >= 1000) && (num < 10000)) {
        if (((num / 1000) == (num % 10)) && ((( num / 100 ) % 10)== (( num / 10) % 10))) {
            capicua = true;
        }
        } if (num >= 10000) {
        if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
            capicua = true;
        } if (num > 100000) {
            System.out.println("El número introducido no es válido, asegurese de que sea de 5 cifras como máximo ");
        }
        } if (capicua) {
            System.out.println("El número introducido es capicúa");
        } if (capicua == false) {
            System.out.println("El número introducido no es capicúa");
        }
    }
}
