import java.util.Scanner;
public class Ejer13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca 3 numeros enteros separados ");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        if ((n1 >= n2) && (n2 >= n3)) {
            System.out.println("Los números ordenados de mayor a menor serían "+n1+" "+n2+" "+n3);
        } if ((n1 >= n2) && (n2 < n3) && (n3 > n1)) {
            System.out.println("Los números ordenados de mayor a menor serían "+n3+" "+n1+" "+n2);
        }  if ((n1 >= n3) && (n3 < n2) && (n2 > n1)) {
        System.out.println("Los números ordenados de mayor a menor serían "+n2+" "+n1+" "+n3);
        }  if ((n1 >= n3) && (n3 >= n2)) {
            System.out.println("Los números ordenados de mayor a menor serían "+n1+" "+n3+" "+n2);
        }  if ((n3 > n1) && (n2 >= n1) && (n3 > n2)) {
            System.out.println("Los números ordenados de mayor a menor serían "+n3+" "+n2+" "+n1);
        } if ((n2 > n1) && (n3 > n1) && (n2 > n3)) {
            System.out.println("Los números ordenados de mayor a menor serían "+n2+" "+n3+" "+n1);
        } 
    }
}
