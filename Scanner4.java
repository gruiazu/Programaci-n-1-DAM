package JAVA.Capítulo3;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca dos números ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int suma= num1+num2;
int resta= num1-num2;
int multi= num1*num2;
int divi= num1/num2;
System.out.println("El resultado de su suma es "+suma);
System.out.println("El resultado de su resta es "+resta);
System.out.println("El resultado de su multipliación es "+multi);
System.out.println("El resultado de su división es "+divi);
    }
}
