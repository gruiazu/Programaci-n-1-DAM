package JAVA.Capítulo3;

public class Lectura5 {
    public static void main(String[] args) {
        String N1;
        String N2;
        System.out.print("Escriba la base del rectángulo ");
        N1 = System.console().readLine();
        int base =Integer.parseInt(N1);
        System.out.print("Escriba la altura del rectángulo ");
        N2 =System.console().readLine();
        int altura=Integer.parseInt(N2);
        int área=base*altura;
System.out.println("El área del rectángulo es "+área);
    }
}
