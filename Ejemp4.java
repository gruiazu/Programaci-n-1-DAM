public class Ejemp4 {
    public static void main(String[] args) {
        for (int num=100; num<=200; num++ ) {
        int resto=num%2;
        if (resto == 0) {
            int suma=num+num;
            System.out.println("La suma del numero par "+num+"+"+num+" es "+suma);
        } if (resto != 0) {
            int suma=num+num;
            System.out.println("La suma del numero impar "+num+"+"+num+" es "+suma);
}
}
}
}