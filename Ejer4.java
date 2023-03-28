package JAVA.Capitulo7;

public class Ejer4 {
    public static void main(String[] args) {
    int[] numero= new int[20];
    int[] cuadrado= new int[20];
    int[] cubo= new int[20];
    int x=0;
    while (x<20) {
        numero[x]=(int)(Math.random()*10);
        cuadrado[x]=numero[x]*numero[x];
        cubo[x]=numero[x]*numero[x]*numero[x];
    x++;
    }
    x=0;
    while (x<20) {
        System.out.println("|"+numero[x]+"|"+cuadrado[x]+"|"+cubo[x]+"|");
        x++;
    }
}
}
