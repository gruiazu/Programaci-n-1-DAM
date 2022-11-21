package JAVA.Capítulo4;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce las horas que trabajas a la semana ");
        int horas=s.nextInt();
        int salario;
        if (horas<=40) {
        salario=horas*12;
    } else  {
    int horas2=horas-40;
    int horas1=horas-horas2;
    salario =horas1*12 + horas2*16;
    }
        System.out.println("Tu salario semanal son "+salario+" euros");

    }
}
