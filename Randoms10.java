package Capitulo6;

public class Randoms10 {
    
    public static void main (String[] args) {
        int num = (int)(Math.random()*40+1);
        int x = 0;
        int carac = (int)(Math.random()*5+1);
        char elec='r';

        if (carac==1) {
            elec='*';
        }

        if (carac==2) {
            elec='-';
        }

        if (carac==3) {
            elec='=';
        }

        if (carac==4) {
            elec='.';
        }

        if (carac==5) {
            elec='|';
        }

        System.out.println("Se van a hacer un total de "+num+" filas de "+elec+".");

        while (x!=num) {
            x++;
            System.out.println(elec+""+elec+""+elec+""+elec+""+elec+""+elec+""+elec+""+elec+""+elec+""+elec);
        }
    }
}
