package Capitulo6;

public class Randoms15 {
    public static void main(String[] args) {
        String nota1 = "do";
        String nota2 = "re";
        String nota3 = "mi";
        String nota4 = "fa";
        String nota5 = "sol";
        String nota6 = "la";
        String nota7 = "si";
        
        
        int numNotas = (int)(Math.random()*7+1);
        numNotas *= 4;

        String melodia = "";
        
        for (int i = 1; i <= numNotas; i++) {
            int notaIndex = (int)(Math.random()*7+1);
            
            if (notaIndex == 0) {
                melodia += nota1 + " ";
            } else if (notaIndex == 1) {
                melodia += nota2 + " ";
            } else if (notaIndex == 2) {
                melodia += nota3 + " ";
            } else if (notaIndex == 3) {
                melodia += nota4 + " ";
            } else if (notaIndex == 4) {
                melodia += nota5 + " ";
            } else if (notaIndex == 5) {
                melodia += nota6 + " ";
            } else {
                melodia += nota7 + " ";
            }
            
            if (i % 4 == 0 && i != numNotas) {
                melodia += "| ";
            }
        }

        melodia += "|";
        System.out.println(melodia);
    }
}

