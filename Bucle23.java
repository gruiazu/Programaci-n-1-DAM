public class Bucle23 {
    public static void main(String[] args) {
    double num;
    double suma=0;
    double cant=0;
    double media=0;
    System.out.println("Introduce números y el programa parará cuando la suma sea más de 10000 ");
    do {
    num= Integer.parseInt(System.console().readLine());
    suma += num;
    cant++;
    } while (suma <= 10000);
    media=suma/cant;
    System.out.println("Ha introducido un total de " + cant + " números");
    System.out.println("La suma de todos los números es " + suma);
    System.out.println("La media es " + media);
    }
}

