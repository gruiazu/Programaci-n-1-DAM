package recuperaciones.C11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {

        String Archivo = "primos.dat";

        try {
            BufferedReader br = new BufferedReader(new FileReader(Archivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                int num = Integer.parseInt(linea);
                System.out.println(num);
            }

            br.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido leer el archivo: " + ioe.getMessage());
        }
    }
    
}
