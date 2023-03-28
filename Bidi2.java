package JAVA.Capitulo7;
import java.util.Scanner;
public class Bidi2 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int[][] num=new int [4][5];
    System.out.print("Introduce 20 números diferentes ");
    int total=0;
    for (int x=0; x<4; x++) {
        for (int i=0; i<5; i++) {
            num[x][i]=s.nextInt();
            total=total+num[x][i];
        }     
    } for (int i=0; i<5; i++) {
        int resulF=num[0][i]+num[1][i]+num[2][i]+num[3][i];
        System.out.println(num[0][i]+"     "+num[1][i]+"     "+num[2][i]+"     "+num[3][i]+"  Suma fila= "+resulF);
    } System.out.println("Suma  Suma  Suma  Suma  Total columnas y filas= "+total);
    int resulC=num[0][0]+num[0][1]+num[0][2]+num[0][3]+num[0][4];
    int resulC2=num[1][0]+num[1][1]+num[1][2]+num[1][3]+num[1][4];
    int resulC3=num[2][0]+num[2][1]+num[2][2]+num[2][3]+num[2][4];
    int resulC4=num[3][0]+num[3][1]+num[3][2]+num[3][3]+num[3][4];
    System.out.println(resulC+"    "+resulC2+"    "+resulC3+"    "+resulC4);
}
}
