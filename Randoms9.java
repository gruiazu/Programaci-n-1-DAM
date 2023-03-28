package Capitulo6;

public class Randoms9 {

    public static void main (String[] args) {
        
    int contador = 0;
    int num = 0; 

    while (num!=24) {
    num = (int)(Math.random()*51)*2;
    System.out.println(num);
    contador++;
    }

    System.out.println("Se ha encontrado el número 24");

    System.out.println("Se han generado " + contador + " números.");
}
}