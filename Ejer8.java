package JAVA.Capítulo4;
import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca las notas de los 3 exámenes ");
        double n1=s.nextDouble();
        double n2=s.nextDouble();
        double n3=s.nextDouble();
        double total=(n1+n2+n3)/3;
        if ((total<5) && (total>=0)) {
            System.out.println("La media de tu nota es un insuficiente");
        } else if ((total>=5) && (total<7)) {
            System.out.println("La media de tu nota es un suficiente");
        } else if ((total>=7) && (total<8)) {
            System.out.println("La media de tu nota es un bien");
        } else if ((total>=8) && (total<9)) {
            System.out.println("La media de tu nota es un notable");
        } else if ((total>=9) && (total<=10)) {
            System.out.println("La media de tu nota es un sobresaliente");
        } else {
            System.out.println("Las notas introducidas no son correctas, asegúrese de los números que ha introducido");
        }
        }    
    }

