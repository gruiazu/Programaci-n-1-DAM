package JAVA.Capitulo7;
public class Ejemp2 {
    public static void main(String[] args) {
        int[][] num= new int[5][10];
        int abajo=0;
        for (int x=0; x<10; x++) {
            for (int y=0; y<5; y++) {
                num [y][x]=abajo;
                //System.out.print(num[y][x]+" ");
                abajo+=2;
            }
            //System.out.println();
        }
        for (int x=0; x<5; x++) {
            for (int y=0; y<10; y++) {
                System.out.print(num[x][y]+" ");
            }
            System.out.println();
        }
    }
}