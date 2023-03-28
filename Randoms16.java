package Capitulo6;

public class Randoms16 {
    public static void main(String[] args) {

        
        String figura1="";
        String figura2="";
        String figura3="";

        for (int i=0; i<=2; i++) {
            int num=(int)(Math.random()*5+1);

            if (i==0) {

                if (num == 1) {
                    figura1="corazón";
                }
                if (num == 2) {
                    figura1="diamante";
                }
                if (num == 3) {
                    figura1="herradura";
                }
                if (num == 4) {
                    figura1="campana";
                }
                if (num == 5) {
                    figura1="limón";
                }
            }

            if (i==1) {
                if (num == 1) {
                    figura2="corazón";
                }
                if (num == 2) {
                    figura2="diamante";
                }
                if (num == 3) {
                    figura2="herradura";
                }
                if (num == 4) {
                    figura2="campana";
                }
                if (num == 5) {
                    figura2="limón";
                }
            }

            if (i==2) {
                if (num == 1) {
                    figura3="corazón";
                }
                if (num == 2) {
                    figura3="diamante";
                }
                if (num == 3) {
                    figura3="herradura";
                }
                if (num == 4) {
                    figura3="campana";
                }
                if (num == 5) {
                    figura3="limón";
                }
            }
        }
        
        System.out.println(figura1 + " " + figura2 + " " + figura3);

        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura2.equals(figura3) || figura1.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}
