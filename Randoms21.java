package Capitulo6;

public class Randoms21 {
    public static void main(String[] args) {

        String moneda="";
        String cara="";


        for (int i=0; i<5; i++) {
        int monedaI= (int)(Math.random()*8+1);
        int caraI=(int)(Math.random()*2+1);
        
        switch (monedaI) {
            case 1:
            moneda = "1 céntimo";
            break;
            case 2:
            moneda = "2 céntimos";
            break;
            case 3:
            moneda = "5 céntimos";
            break;
            case 4:
            moneda = "10 céntimos";
            break;
            case 5:
            moneda = "20 céntimos";
            break;
            case 6:
            moneda = "50 céntimos";
            break;
            case 7:
            moneda = "1 euro";
            break;
            case 8:
            moneda = "2 euros";
            break;
        default:
        System.out.println("El valor generado no ha sido correcto ");
        }

        if (caraI==1) {
            cara="cara";
        }

        if (caraI==2) {
            cara="cruz";
        }

            System.out.println(moneda + " - " + cara);
        }
    }
}
