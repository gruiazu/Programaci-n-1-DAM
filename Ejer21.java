import java.util.Scanner;
public class Ejer21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce tu nota en cada uno de los 2 exámenes de programación ");
        double N1=s.nextDouble();
        double N2=s.nextDouble();
        double Media=(N1+N2)/2;
        if ((Media >= 5) && (Media <= 10)) {
            System.out.println("Tu nota media está aprobada y es un "+Media+" sobre 10");
        } if (Media > 10) {
            System.out.println("Las notas introducidas son incorrectas, recuerda que tienen que ser sobre 10");
        } if (Media < 5) {
            System.out.print("Tu nota media es de suspenso ¿Cual fué tu nota en la recuperación? (apto/no apto) ");
            String Recu=System.console().readLine();
            if (Recu.equals("apto")) {
                System.out.println("Tu nota de programación es un 5");
        } if (Recu.equals("no apto")) {
            System.out.println("Tu nota de programción es un "+Media+" sobre 10");
        }
        }
    } 
}
