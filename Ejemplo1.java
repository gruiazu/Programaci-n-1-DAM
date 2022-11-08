package JAVA.Capítulo3;

public class Ejemplo1 {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        System.out.print("Por favor, dime cómo te llamas: ");
        nombre = System.console().readLine();
        System.out.print("¿Y tus apellidos?");
        apellido = System.console().readLine();
        System.out.println("Hola " + nombre +" "+ apellido +", ¡encantado de conocerte!");
    }       
}
