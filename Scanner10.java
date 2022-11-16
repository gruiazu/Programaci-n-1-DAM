package JAVA.Capítulo3;
import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introudce los Mb que quieras pasar a Kb ");
        int Mb=s.nextInt();
        int kb=Mb*1000;
        System.out.println(Mb+" Mb son "+kb+" Kb");
    }
}
