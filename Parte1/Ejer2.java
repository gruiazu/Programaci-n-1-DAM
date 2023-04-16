package JAVA.Capítulo14.Parte1;

import java.util.Scanner;

public class Ejer2 {

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
}
    public static void main(String[] args) {
       

        Scanner s=new Scanner(System.in);

        int opcion = 0;
        int km;     
    
        bicicleta bici = new bicicleta();
        coche coche = new coche();
    
        while (opcion != 8) {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
        

            /**
             * Hacemos uso del método isNumeric con la variable entrada
             * así el programa no para aunque el valor de esta variable sea un num mayor a 8 o una palabra
             */
            String entrada = s.next();
            if (isNumeric(entrada)) {
                opcion = Integer.parseInt(entrada);
                switch (opcion) {
                    case 1:
                        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                        km = s.nextInt();
                        bici.recorrer(km);
                        break;
                    case 2:
                        bici.hacerCaballito();
                        break;
                    case 3:
                        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                        km = s.nextInt();
                        coche.recorrer(km);
                        break;
                    case 4:
                        coche.quemarRueda();
                        break;
                    case 5:
                        System.out.print("La bicicleta lleva recorridos ");
                        System.out.println(bici.getKilometrosRecorridos() + " Km");
                        break;
                    case 6:
                        System.out.print("El coche lleva recorridos ");
                        System.out.println(coche.getKilometrosRecorridos() + " Km");
                        break;
                    case 7:
                        System.out.print("Los vehículos llevan recorridos ");
                        System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                        break;
                    case 8: 
                        System.out.println("Has cerrado el programa, hasta la próxima ");
                    default:
                        System.out.println("Recuerda que tienes que utilizar un número entre el 1 y el 8.");
                } 
            } else {
                System.out.println("La entrada debe ser un número.");
            }
        }
    }
}

    
    
    