import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduza su día de nacimiento y el mes (en ese orden) ");
        int dia=s.nextInt();
        int mes=s.nextInt();
        if (mes == 1) {
            if (dia >= 21) {
                System.out.println("Eres acuario");
            } else {
                System.out.println("Eres capricornio");
            }
        }
        if (mes == 2) {
            if (dia >= 19) {
                System.out.println("Eres piscis");
            } else {
                System.out.println("Eres acuario");
            }
        }
        if (mes == 3) {
            if (dia >= 20) {
                System.out.println("Eres aries");
            } else {
                System.out.println("Eres piscis");
            }
        }
        if (mes == 4) {
            if (dia >= 20) {
                System.out.println("Eres tauro");
            } else {
                System.out.println("Eres aries");
            }
        }
        if (mes == 5) {
            if (dia >= 21) {
                System.out.println("Eres géminis");
            } else {
                System.out.println("Eres tauro");
            }
        }
        if (mes == 6) {
            if (dia >= 20) {
                System.out.println("Eres cancer");
            } else {
                System.out.println("Eres géminis");
            }
        }
        if (mes == 7) {
            if (dia >= 22) {
                System.out.println("Eres leo");
            } else {
                System.out.println("Eres cancer");
            }
        }
        if (mes == 8) {
            if (dia >= 21) {
                System.out.println("Eres virgo");
            } else {
                System.out.println("Eres leo");
            }
        }
        if (mes == 9) {
            if (dia >= 22) {
                System.out.println("Eres libra");
            } else {
                System.out.println("Eres virgo");
            }
        }
        if (mes == 10) {
            if (dia >= 22) {
                System.out.println("Eres escorpio");
            } else {
                System.out.println("Eres libra");
            }
        }
        if (mes == 11) {
            if (dia >= 21) {
                System.out.println("Eres sagitario");
            } else {
                System.out.println("Eres escorpio");
            }
        }
        if (mes == 12) {
            if (dia >= 21) {
                System.out.println("Eres capricornio");
            } else {
                System.out.println("Eres sagitario");
            }
        }
        if ((mes > 12) || (mes < 1) ||  (dia < 0) || (dia > 31)) {
            System.out.println("Fecha no válida");
        }
        
    }

}
