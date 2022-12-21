import java.util.Scanner;
public class Bucle39 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce un número positivo ");
    int num=s.nextInt();
    if (num<=0) {
        System.out.println("El número introducido no es válido, recuerda que sea entero y positivo");
    }
    if (num>0) {
    for (int x = 1; x <= num; x++) {
        int fact = x;
        for (int i = 1; i < x; i++) {
            fact *= i;
        }
        System.out.println(x + "! = " + fact);
        }
    }
    }
}

