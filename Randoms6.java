package Capitulo6;

public class Randoms6 {
    public static void main(String[] args) {
    
        int oportunidades = 5;
        int num;
        boolean acertado = false;
        int numeroMisterioso = (int)(Math.random() * 101);
        
        System.out.println("Tienes 5 oportunidades para adivinar el número en el que estoy pensando. ");
    
        while (!acertado && (oportunidades > 0)) {
            System.out.print("Introduce tu número: ");
            num = Integer.parseInt(System.console().readLine());
            oportunidades--;
    
            if ( (num > numeroMisterioso) && (oportunidades > 0) ){
            System.out.println("El número que estoy pensando es menor que el que has introducido");
            System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }
        
            if ( (num < numeroMisterioso) && (oportunidades > 0) ){
            System.out.println("El número que estoy pensando es mayor que el que has introducido");
            System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }
            
            if (num == numeroMisterioso) {
            acertado = true;
            System.out.println("Has acertado");
            }
        } 
        
        if (!acertado) {
            System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " + numeroMisterioso);
        }
        }
}
