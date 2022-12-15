public class Ejer12 {

    public static void main(String[] args) {
        System.out.println("Responde a las preguntas con verdadero o falso");
        System.out.print("El operador && devuelve verdadero cuando las 2 condiciones son verdaderas ");
        String r1 = System.console().readLine();
        int total=0;
        if (r1.equals("verdadero")) {
            total++;
            System.out.println("Has acertado");
        } if (r1.equals("falso")) {
            System.out.println("Has fallado");
        } 
        System.out.print("Switch es exactamente igual al if ");
        String r2 = System.console().readLine();
        if (r2.equals("verdadero")) {
            System.out.print("Has fallado");
        } if (r2.equals("falso")) {
            total++;
            System.out.println("Has acertado");
        } 
        System.out.print("El operador != es para cuando un número es igual a otro ");
        String r3 = System.console().readLine();
        if (r3.equals("verdadero")) {
            System.out.print("Has fallado");
        } if (r3.equals("falso")) {
            total++;
            System.out.println("Has acertado");
        } 
        System.out.print("El operador % se usa para calcular el resto de una división ");
        String r4 = System.console().readLine();
        if (r4.equals("verdadero")) {
            total++;
            System.out.println("Has acertado");
        } if (r4.equals("falso")) {
            System.out.println("Has fallado");
        } 
        System.out.print("El operador -- sirve para incrementar el valor de una variable ");
        String r5=System.console().readLine();
        if (r5.equals("verdadero")) {
            System.out.print("Has fallado");
        } if (r5.equals("falso")) {
            total++;
            System.out.println("Has acertado");
        } 
        System.out.print("Al principio de el programa hay que poner public class y el nombre del archivo en cuestión ");
        String r6=System.console().readLine();
        if (r6.equals("verdadero")) {
            total++;
            System.out.println("Has acertado");
        } if (r6.equals("falso")) {
            System.out.println("Has fallado");
        } 
        System.out.print("Mediante el uso de la clase Scanner es posible leer varios datos de una misma linea ");
        String r7=System.console().readLine();
        if (r7.equals("verdadero")) {
            total++;
            System.out.println("Has acertado");
        } if (r7.equals("falso")) {
            System.out.println("Has fallado");
        } 
        System.out.print("El s.next() se utiliza para leer un número entero ");
        String r8=System.console().readLine();
        if (r8.equals("verdadero")) {
            System.out.print("Has fallado");
        } if (r8.equals("falso")) {
            total++;
            System.out.println("Has acertado");
        } 
        System.out.print("El s.nextDouble() se utiliza para leer números decimales ");
        String r9=System.console().readLine();
        if (r9.equals("verdadero")) {
            total++;
            System.out.println("Has acertado");
        } if (r9.equals("falso")) {
            System.out.println("Has fallado");
        } 
        System.out.print("System.console().readLine(). se usa para recoger datos por teclado ");
        String r10=System.console().readLine();
        if (r10.equals("verdadero")) {
            total++;
            System.out.println("Has acertado");
        } if (r10.equals("falso")) {
            System.out.println("Has fallado");
        } 
        System.out.println("Tu nota es de un "+total+" sobre 10");
    }
}

