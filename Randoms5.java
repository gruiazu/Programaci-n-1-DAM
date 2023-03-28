package Capitulo6;

public class Randoms5 {
    
    public static void main (String[] args) {
        int num;
        int total=0;
        int min=199;
        int max=100;
        for (int i=0; i<20; i++) {
            num =(int)(Math.random()*100+100);
            System.out.print(num+" ");
            total=total+num;

            if (num<min) {
                min=num;
            }
            if (num>max) {
                max=num;
            }
        }
        int media=total/20;
        System.out.println();
        System.out.println("La media de los numeros es "+media);
        System.out.println("El minimo de los numeros es "+min);
        System.out.println("El máximo de los numeros es "+max);
    }
}
