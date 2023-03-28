package JAVA.Capitulo7;

public class Bidi1 {
    public static void main(String[] args) {
        int[][] num=new int[3][6];
        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[1][0]=75;   
        num[0][5]=5; 
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        num[1][4]=0;
        System.out.println("        Columna 0  Columna 1  Columna 2 Columna 3 Columna 4 Columna 5");
        for (int i=0; i<3; i++ ) {
        System.out.println("Fila "+i+"=  "+num[i][0]+"         "+num[i][1]+"         "+num[i][2]+"          "+num[i][3]+"        "+num[i][4]+"         "+num[i][5]);
        }
    }
}
