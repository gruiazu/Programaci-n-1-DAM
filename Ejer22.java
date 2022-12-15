import java.util.Scanner;
public class Ejer22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce el que día de la semana es (lunes a viernes) ");
        String dia=System.console().readLine();
        System.out.print("Introduce la hora separada con un espacio entre hora y minutos "); 
        int hora=s.nextInt();
        int min=s.nextInt();
        int diaNum = 0;

        switch(dia) {
        case "lunes":
            diaNum = 0;
            break;

        case "martes":
            diaNum = 1;
            break;

        case "miercoles":
            diaNum = 2;
            break;

        case "jueves":
            diaNum = 3;
            break;

        case "viernes":
            diaNum = 4;
            break;
            
        default:
            System.out.print("El día introducido no es correcto.");
        }
        int mins = (4 * 24 * 60) + (15 * 60);
        int mins2 = (diaNum * 24 * 60) + (hora * 60) + min;
        int totalmin = mins - mins2;
        System.out.print("Faltan " + totalmin + " minutos para llegar al fin de semana.");

}
}