import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;

public class ProbarExcepciones {

    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Elije entre las siguientes opciones para provocar un error distinto (tienes que poner el número que le corresponda): ");
            System.out.println("1. Provocar StackOverFlowError");
            System.out.println("2. Provocar NumberFormatException");
            System.out.println("3. Provocar ArrayIndexOutOfBoundsException");
            System.out.println("4. Provocar FileNotFoundException");
            System.out.println("5. Provocar ArithmeticException");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    funcion1();
                    break;
                case 2:
                    funcion2();
                    break;
                case 3:
                    funcion3();
                    break;
                case 4:
                    funcion4();
                    break;
                case 5:
                    funcion5();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } catch (StackOverflowError e) {
            System.out.println("Excepción: " + e.getClass().getName());
        } catch (NumberFormatException e) {
            System.out.println("Excepción: " + e.getClass().getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción: " + e.getClass().getName());
        } catch (FileNotFoundException e) {
            System.out.println("Excepción: " + e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println("Excepción: " + e.getClass().getName());
        }
    }

    public static void funcion1() {
        funcion1();
    }

    public static void funcion2() {
        System.out.println("Escribe una palabra");
        String input = System.console().readLine();
        int numero = Integer.parseInt(input);
    }

    public static void funcion3() {
        int num[] = new int[3];
        num[3] = 4;
    }

    public static void funcion4() throws FileNotFoundException {
        throw new FileNotFoundException("Archivo no encontrado");
    }

    public static void funcion5() {
        int num = 1/0;
    }
}



