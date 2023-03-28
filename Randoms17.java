package Capitulo6;
import java.util.Scanner;

public class Randoms17 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            System.out.print("Introduce la altura de la pecera (mínimo 4): ");
            int altura = s.nextInt();
    
            System.out.print("Introduce la anchura de la pecera (mínimo 4): ");
            int anchura = s.nextInt();
    

            char[][] pecera = new char[altura][anchura];
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < anchura; j++) {
                    if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1) {
                        pecera[i][j] = '*'; 
                    } else {
                        pecera[i][j] = ' ';
                    }
                }
            }
    
            int posX = (int) (Math.random() * (anchura - 2)) + 1;
            int posY = (int) (Math.random() * (altura - 2)) + 1;
    

            pecera[posY][posX] = '&';
    
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < anchura; j++) {
                    System.out.print(pecera[i][j] + " ");
                }
                System.out.println();
            }
        }
}
