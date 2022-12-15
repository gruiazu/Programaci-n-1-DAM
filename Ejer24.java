import java.util.Scanner;
public class Ejer24 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce el cargo de empleado con un número del 1 al 3 (1- Prog. junior 2- Prog. senior 3- Jefe de proyecto) ");
        int cargo=s.nextInt();
        int sueldo=0;
        System.out.print("Introduce los días que has estado de viaje visitando clientes ");
        int dias=s.nextInt();
        int dietas=dias*30;
        System.out.print("Introduce tu estado civil (soltero o casado) ");
        String estC=System.console().readLine();
        int IRPF=0;
        if (cargo == 1) {
            sueldo=950;
        } if (cargo == 2) {
            sueldo=1200;
        } if (cargo == 3) {
            sueldo=1600;
        } if ((cargo !=1) && (cargo !=2) && (cargo!=3)) {
            System.out.println("El cargo introducido no es correcto, recuerda que tiene que ser un número del 1 al 3");
        } if (estC.equals("soltero")) {
            IRPF=25;
        } if (estC.equals("casado")) {
            IRPF=20;
        } if (!(estC.equals("soltero")) || !(estC.equals("casado"))) {
            System.out.println("El estado civil no es correcto, recuerda que tiene que ser o soltero o casado");
        } 
        int total=(sueldo+dietas)*IRPF/100;
        System.out.println("Si no has tenido ningún error al poner los datos, el sueldo neto sería de "+total);
    }
    
}
