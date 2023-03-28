package Capitulo6;

public class Randoms13 {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        int total;

        do {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            total=dado1+dado2;
            System.out.println("Tirada de dados: " + dado1 + " y " + dado2+" = "+total);
        } while (dado1 != dado2);

        System.out.println("Ambos dados tienen el mismo valor: " + dado1);
    }
}
