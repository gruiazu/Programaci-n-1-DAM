package Capitulo9.Ejer1Arrays;

public class Gato {
    private static String nombre;
    private static int edad;
    private static String raza;

    public Gato(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    public static String getNombre() {
        return nombre;
    }

    public static int getEdad() {
        return edad;
    }

    public static String getRaza() {
        return raza;
    }
}

