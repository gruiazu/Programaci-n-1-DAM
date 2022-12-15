public class Ejer15 {
    public static void main(String[] args) {    
        System.out.print("Para que lado quieres que apunte la pirámide entre arriba, abajo, izquierda o derecha ");
        String resp=System.console().readLine();
        if (resp.equals("arriba")) {
        System.out.println("    *"); 
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        } if (resp.equals("abajo")) {
            System.out.println("*********");
            System.out.println(" *******");
            System.out.println("  *****");
            System.out.println("   ***");
            System.out.println("    *"); 
        } if (resp.equals("derecha")) {
            System.out.println("*");
            System.out.println("***");
            System.out.println("*****");
            System.out.println("******");
            System.out.println("*****");
            System.out.println("***");
            System.out.println("*"); 
        } if (resp.equals("izquierda")) {
            System.out.println("     *");
            System.out.println("   ***");
            System.out.println(" *****");
            System.out.println("******");
            System.out.println(" *****");
            System.out.println("   ***");
            System.out.println("     *"); 
        } if (!(resp.equals("abajo")) && !(resp.equals("izquierda")) && !(resp.equals("derecha")) && !(resp.equals("abajo")) && !(resp.equals("arriba"))) {
            System.out.println("Respuesta introducida no válida");
        } 
}
}
