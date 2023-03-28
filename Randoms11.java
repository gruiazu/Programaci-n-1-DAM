package Capitulo6;

public class Randoms11 {
    public static void main(String[] args) {
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        

        System.out.println("Las notas de la clase han sido: ");

        for (int i = 0; i < 20; i++) {
            int nota =(int)((Math.random() * 10)+1);
            System.out.print(nota);
            if (nota < 5) {
                System.out.println("Suspenso");
                suspenso++;
            } else if (nota < 6) {
                System.out.println("Suficiente");
                suficiente++;
            } else if (nota < 7) {
                System.out.println("Bien");
                bien++;
            } else if (nota < 9) {
                System.out.println("Notable");
                notable++;
            } else {
                System.out.println("Sobresaliente");
                sobresaliente++;
            }
        }

        System.out.println("Resumen de notas:");
        System.out.println("Suspenso: " + suspenso);
        System.out.println("Suficiente: " + suficiente);
        System.out.println("Bien: " + bien);
        System.out.println("Notable: " + notable);
        System.out.println("Sobresaliente: " + sobresaliente);
    }
}
