import java.util.Scanner;
public class Ejer11 {
    
    public static void main(String[]args ) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce la hora y los minutos separados por un espacio ");
        int hora=s.nextInt();
        int min=s.nextInt();
        int resul;
        int minR;
        int horaR;
        if (( min >= 60) || (hora >= 24) || (min < 0) || (hora < 0)){
            System.out.println("La hora introducida no es válida");
        }
        if ((min == 0) && (hora > 0)) {
            resul= 24-hora;
            System.out.println("Quedan "+resul+" horas para la medianoche");
        }
        if (hora == 23) {
            resul= 60-min;
            System.out.println("Quedan "+resul+" minutos para la medianoche");
        }
        if ((hora == 0) && (min <=59)) {
            System.out.println("Ya es medianoche");
        }   
        if ((hora < 23) && (min < 60) && (hora > 0) && (min > 0)) {
            minR=60-min;
            horaR=23-hora;
            System.out.println("Quedan "+horaR+" horas y "+minR+" minutos para la medianoche");
        }
    }
}
