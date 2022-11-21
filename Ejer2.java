package JAVA.Capítulo4;
import java.util.Scanner;
public class Ejer2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.print("Introduce que hora es (sin minutos) ");
    int hora=s.nextInt();
    if ((hora >= 6) && (hora <=12)) {
    System.out.println("Hola, buenos días");
    } else if 
    ((hora >= 13) && (hora <= 20)) {
    System.out.println("Hola, buenas tardes");
    } else if 
     ((hora >= 21) && (hora <= 24)) {
    System.out.println("Hola, buenas noches");
    } else if 
    ((hora >=0) && (hora <=5)) {
        System.out.println("Hola, buenas noches");
    } else {  
        System.out.println("La hora introducida no es correcta");
    }
}
}   
    

