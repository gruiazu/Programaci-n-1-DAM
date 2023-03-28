package JAVA.Capitulo7;

public class Ejemp3 {
    
    public static void main(String[] arg) {
    int num[][]=new int[11][11];
    for (int y=1; y<11; y++) {
        for (int x=1; x<11; x++) {
            num[x][y]=y*x;
            System.out.print(num[x][y]+" ");
        }
        System.out.println();
    }
    }
}
