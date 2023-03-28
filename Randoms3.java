package Capitulo6;

public class Randoms3 {
    
    public static void main (String[] args) {
        String palo="";
        String num="";

        int numpalo = (int)(Math.random()*4+1);

        switch (numpalo) {
            case 1: 
            palo="oros";
            break;

            case 2:
            palo="bastos";
            break;

            case 3:
            palo="copas";
            break;

            case 4:
            palo="espadas";
            break;

        }
        int numC = (int)(Math.random()*13+1);

        switch (numC) {
            case 1:
            num="as ";
            break;

            case 10:
            num="Sota ";
            break;

            case 11:
            num="Caballo ";
            break;

            case 12:
            num="Rey ";
            break;

            default:
            num=numC+" ";
        }
        System.out.println(num+"de "+palo);
    }
}
