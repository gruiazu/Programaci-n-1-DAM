import java.util.Scanner;
public class Bucle25 {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce un número entero de al menos 2 dígitos ");
    int num=s.nextInt();
    int x=num;
    int volteado=0;
    if (num<10) {
        System.out.println("El número introducido es demasiado pequeño, asegurate de que tenga mínimo 2 cifras");
    } if (num>=10) {
        while (x > 0) {
            volteado=(volteado*10)+(x%10);
            x/= 10;
            
    } 
    System.out.print("Si le damos la vuelta al número " + num+" obtenemos el número "+volteado);
}
}
}

