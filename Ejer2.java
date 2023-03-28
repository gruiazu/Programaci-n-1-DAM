package JAVA.Capitulo7;

public class Ejer2 {
    public static void main(String[] args) {
        char[] simbolo = new char[12];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[8] = '+';
        simbolo[9] = 'Q';
        System.out.println("Índice    0   1   2   3   4   5   6   7   8   9   10   11");
        System.out.println("Valor     "+simbolo[0]+"   "+simbolo[1]+"   "+simbolo[2]+"   "+simbolo[3]+"     "+simbolo[4]+"   "+simbolo[5]+"  "+simbolo[6]+"   "+simbolo[7]+"      "+simbolo[8]+"   "+simbolo[9]+"   "+simbolo[10]+"   "+simbolo[11]);
        System.out.println("Como podemos ver lo que sucede con los valores de los elementos que no se han inicializado se toman como un espacio en blanco");
    }
}

