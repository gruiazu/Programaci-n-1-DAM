package Capitulo6;

public class Randoms2 {
    public static void main(String[] args) {
        String palo="";
        String num="";

        int numpalo = (int)(Math.random()*4+1);

        switch (numpalo) {
            case 1: 
            palo="pica";
            break;

            case 2:
            palo="trebol";
            break;

            case 3:
            palo="diamantes";
            break;

            case 4:
            palo="corazon";
            break;

        }
        int numC = (int)(Math.random()*13+1);

        switch (numC) {
            case 1:
            num="as ";
            break;

            case 11:
            num="J ";
            break;

            case 12:
            num="Q ";
            break;

            case 13:
            num="K ";
            break;

            default:
            num=numC+" ";
        }
        System.out.println(num+"de "+palo);
    }
}
