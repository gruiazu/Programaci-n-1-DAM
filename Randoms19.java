package Capitulo6;

public class Randoms19 {
    
    public static void main (String[] args ) {

        int num;
        int suma=0;
        int max=-100;
        int min=200;
        for (int i = 0; i < 50; i++) {
            num = (int) (Math.random() * 301) - 100; 
            System.out.print(num + " ");
            suma += num;
            if ((num % 2 == 0 ) && (num > max)) {
                max=num;
            }
            if ((num % 2 != 0 ) && (num < min)) {
                min=num;
            }
            if (i==49) {
                System.out.println(" ");
            }
        }
        
        int media=suma/50;
        System.out.println("El máximo de los pares es "+max);
        System.out.println("El míinimo de los impares es "+min);
        System.out.println("Su media es "+media);

    }
}
