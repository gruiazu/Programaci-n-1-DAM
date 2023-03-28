package Capitulo6;

public class Randoms1 {
    public static void main(String [] args) {
        System.out.println("Los numeros que se han dado tirando 3 dados son: ");
        int num;
        int total=0;
        for (int i=0; i<3; i++) {
            num = (int)(Math.random()*6+1);
            System.out.print(num+" ");
            total=total+num;
        }
        System.out.println("El resultado de la suma de los 3 dados es "+total);
}
}
