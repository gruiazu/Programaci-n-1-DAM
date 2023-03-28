package JAVA.Capitulo7;
import java.util.Scanner;
public class Ejer3 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int[] n = new int[10];
    int i;
    System.out.println("Introduce 10 números ");
    for (i = 0; i < 10; i++) {
        n[i] = s.nextInt();
    }
        
    System.out.println("Los números introducidos al revés son los siguientes: ");
    for (i = 9; i >= 0; i--) {
        System.out.println(n[i]);
        }
    }
}