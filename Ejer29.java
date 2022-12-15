import java.util.Scanner;

public class Ejer29 {

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String pit = "";
    String resul = "";
    double precioComida = 0;
    double precioBebida = 0;
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida=System.console().readLine();
    if (comida.equalsIgnoreCase("pitufo")) {
    System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
    pit=System.console().readLine();

    if (pit.equals("aceite")) {
        resul= "Pitufo con aceite: 1,20 €";
        precioComida = 1.20;
    } if (pit.equals("tortilla")) {
        resul= "Pitufo con tortilla: 1,60 €";
        precioComida = 1.60;
    }
    } if (comida.equals("palmera")) {
    resul= "Palmera: 1,40 €";
    precioComida = 1.40;
    } if (comida.equals("donut")) {
    resul= "Donut: 1,00 €";
    precioComida = 1.00;
    }
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida =System.console().readLine();
    if (bebida.equals("zumo")) {
        resul+= "Zumo: 1,50 €";
        precioBebida = 1.50;
    } else if (bebida.equals("café")) {
        resul+= "Café: 1,20 €";
        precioBebida = 1.20;
    }
double total=precioComida+precioBebida;
    System.out.println(resul);
    System.out.printf("Total desayuno: "+total);
}
}