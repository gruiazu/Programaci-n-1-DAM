package recuperaciones.C11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String Archivo="primos.dat";

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo));

            for (int cont=0; cont<=500; cont++) {
                for (int x = 2; x <= cont; x++) {  
                    int i = 2;               
                    while (x % i != 0) {
                        i++;
                    }
                    if (i == x) {                           
                        bw.write(x);
                    }
            }
        }

            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero: "+ioe.getMessage());
            }
    }
}