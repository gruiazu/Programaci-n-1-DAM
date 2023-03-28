package JAVA.Capitulo7;

public class Ejer1 {
    public static void main(String[] args) {
        int[] num= new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        System.out.println("Índice    0   1   2   3   4   5   6   7   8   9   10   11");
        System.out.println("Valor    "+num[0]+"  "+num[1]+"   "+num[2]+"   "+num[3]+"   "+num[4]+"   "+num[5]+"  "+num[6]+"   "+num[7]+"   "+num[8]+"  "+num[9]+"   "+num[10]+"   "+num[11]);
        System.out.println("Como podemos ver lo que sucede con los valores de los elementos que no se han inicializado se toman como 0");
    }
}
