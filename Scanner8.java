package JAVA.Capítulo3;
import java.util.Scanner;
public class Scanner8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce las horas que trabajas a la semana ");
        int horas=s.nextInt();
        int salario=horas*12;
        System.out.println("Tu salario semanal son "+salario+" euros");
    }
}
