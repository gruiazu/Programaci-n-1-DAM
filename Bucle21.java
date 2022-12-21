
public class Bucle21 {
    public class S05Ejercicio21 {
    public static void main(String[] args) {
        int nums;
        int cantnums = 0;
        int SI = 0;
        int CantI = 0;
        int maxP = 0;
    System.out.print("Introduce numeros enteros (puedes terminar con un número negativo) ");
    do {
    nums = Integer.parseInt(System.console().readLine());
    if (nums >= 0) {
    cantnums++;
    if ((nums % 2) == 1) { 
    SI += nums;
    CantI++;
    } else { 
    if (nums > maxP)
    maxP = nums;
    }
    }
    } while (nums >= 0);
    int mediaImp=SI/CantI;
    System.out.println("Has introducido " + cantnums + " números positivos");
    System.out.println("La media de los impares es "+ mediaImp);
    System.out.println("El máximo de los pares es " + maxP);
        }
}
}
