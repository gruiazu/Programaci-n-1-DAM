package JAVA.Capítulo3;
import java.util.Scanner;

public class Scanner11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introudce los Kb que quieras pasar a Mb ");
        double Kb=s.nextDouble();
        double Mb=Kb/1000;
        System.out.println(Kb+" Kb son "+Mb+" Mb");
    }
}
