package Capitulo9.EJERCICIO3;

import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int opcion1=0;
        int opcion2=0;
        
        Animal animal = new Animal();
        Ave ave = new Ave();
        Canario canario = new Canario();
        Gato gato = new Gato();
        Lagarto lagarto = new Lagarto();
        Mamifero mamifero = new Mamifero();
        Perro perro = new Perro();
        Pinguino pinguino = new Pinguino();

        System.out.println("Selecciona una de las opciones escribiendo un número del 1 al 8. ");
        System.out.println("1- Animal");
        System.out.println("2- Mamífero");
        System.out.println("3- Ave");
        System.out.println("4- Gato");
        System.out.println("5- Perro");
        System.out.println("6- Canario");
        System.out.println("7- Pinguino");
        System.out.println("8- Lagarto");
        opcion1 = s.nextInt();

        switch (opcion1) {
            case 1: 
                System.out.println("Ahora elige un número del uno al 3.");
                opcion2 = s.nextInt();
                switch (opcion2) {
                    case 1:
                    animal.comer();    
                    break;
                    case 2:
                    animal.dormir();
                    break;
                    case 3:
                    animal.hacerSonido();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");              
                } break;
                case 2: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    mamifero.ballena();    
                    break;
                    case 2:
                    mamifero.osoh();
                    break;
                    case 3:
                    mamifero.canguro();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");              
                } break;
                case 3: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    ave.volar();   
                    break;
                    case 2:
                    ave.picotear();
                    break;
                    case 3:
                    ave.cantar();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");   
                } break;
                case 4: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    gato.cazar();   
                    break;
                    case 2:
                    gato.ronronear();
                    break;
                    case 3:
                    gato.maullar();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");   
                } break;
                case 5: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    perro.comer();   
                    break;
                    case 2:
                    perro.dormir();
                    break;
                    case 3:
                    perro.ladrar();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");   
                } break;
                case 6: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    canario.cantandoC();   
                    break;
                    case 2:
                    canario.vueltas();
                    break;
                    case 3:
                    canario.volarAlrededor();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");   
                } break;
                case 7: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    pinguino.bailar();   
                    break;
                    case 2:
                    pinguino.deslizarse();
                    break;
                    case 3:
                    pinguino.nadar();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");   
                } break;
                case 8: 
                    System.out.println("Ahora elige un número del uno al 3.");
                    opcion2 = s.nextInt();
                    switch (opcion2) {
                    case 1:
                    lagarto.cazar();
                    break;
                    case 2:
                    lagarto.sol();
                    break;
                    case 3:
                    lagarto.mudar();
                    break;
                    default:
                    System.out.println("Has introducido un número incorrecto ");   
                } break;
                default:
                System.out.println("Has introducido un número incorrecto ");   
        }
    }
}
