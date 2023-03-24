package Capitulo9.Ejer1Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        Gato[] gatos = new Gato[4];

        // Introducir los datos de cada gato mediante un bucle
        for (int i = 0; i < 4; i++) {
            String nombre = "Gato " + (i+1);
            int edad = i + 1;
            String raza = "Raza " + (i+1);

            gatos[i] = new Gato(nombre, edad, raza);
        }

        // Mostrar los datos de todos los gatos mediante un bucle
        for (int i=0; i < 4; i++) {
            System.out.println("Nombre: " + Gato.getNombre() + ", Edad: " + Gato.getEdad() + ", Raza: " + Gato.getRaza());
        }
    }
}
