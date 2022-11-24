package JAVA.Capítulo4;
import java.util.Scanner;

public class Localidades {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Introduzca la parada en la que se ha bajado del 1 al 12 ");
    int para=s.nextInt();
    String recorrido=" ";
    switch (para) {
        case 1:
        recorrido+="Málaga";
        
        case 2:
        recorrido+=" Granada";
       
        case 3:
        recorrido+=" Sevilla";
        
        case 4:
        recorrido+=" Cordoba";

        case 5:
        recorrido+=" Almería";

        case 6:
        recorrido+=" Murcia";

        case 7:
        recorrido+=" Valencia";
        
        case 8:
        recorrido+=" Madrid";

        case 9:
        recorrido+=" Valladolid";

        case 10:
        recorrido+=" Bilbao";
        
        case 11:
        recorrido+=" Zaragoza y ";
        
        case 12:
        recorrido+="Barcelona";
        System.out.println("Has pasado por "+recorrido);
        break;
    }
    }
}
