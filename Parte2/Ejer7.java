package JAVA.Capítulo14.Parte2;
import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
  
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        Scanner s = new Scanner(System.in);
        int opcion;
        /**
         * Introducimos el try de manera que nos vuelva al menú
         * Lo colocamos dentro del do para que no se reinicen los valores de las entradas
         */
        do {
           try {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Compra de entradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas disponibles:");
                    System.out.println("Para la sala principal quedan: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Para la compra-venta quedan: " + compraVenta.getEntradasPorVender());
                    System.out.println("Para la zona VIP quedan: " + zonaVip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.print("Seleccione una zona (1 - Sala principal, 2 - Compra-venta, 3 - Zona VIP): ");
                    int zona = s.nextInt();
                    System.out.println("Elija también el número de entradas deseadas. ");
                    int num = s.nextInt();
                    switch (zona) {
                        case 1:
                            salaPrincipal.vender(num);
                            break;
                        case 2:
                            compraVenta.vender(num);
                            break;
                        case 3:
                            zonaVip.vender(num);
                            break;
                        default:
                            System.out.println("Tienes que elegir un número entre el 1 y el 3. ");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            /**
             * Procedemos a introducir el catch
             * Ponemos que se muestre un mensaje de que ha habido un error al introducir la opción
             * Reiniciamos el valor de la opción a 0 para asegurarnos de que el bucle funcione
             */
        } catch (Exception e) {
            System.out.println("La opción introducida no es válida");
            opcion = 0;
        }
        } while (opcion != 3);
    }
}
