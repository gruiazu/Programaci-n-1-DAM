package JAVA.Capitulo7;
import java.util.Scanner;
public class Ejer5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num=new int[10];
        int i=0;
        System.out.print("Introduce 10 números enteros separados por un espacio ");
        while (i<10) {
            num[i]=s.nextInt();
            i++;
        }
        i=0;
        while (i<10) {
            System.out.println("");
            i++;
        }
   
    }
}
