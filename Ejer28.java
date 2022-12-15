import java.util.Scanner;
public class Ejer28 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String jugada2 = s.nextLine();
    if (jugada1.equals(jugada2)) {
        System.out.println("Empate");
    } if ((!(jugada1.equals("tijera")) || !(jugada1.equals("piedra")) || !(jugada1.equals("papel"))) && (!(jugada2.equals("tijera")) || !(jugada2.equals("piedra")) || !(jugada2.equals("papel")))) {
        System.out.println("Uno de los jugadores no ha introducido una opción correcta");
    } else { 
    int ganador = 2;

    switch(jugada1) {

        case "piedra":
            if (jugada2.equals("tijera")) {
            ganador = 1;
        } break;

        case "papel":
        if (jugada2.equals("piedra")) {
            ganador = 1;
        } break;

        case "tijera":
        if (jugada2.equals("papel")) {
            ganador = 1;
        } break;
        default:  }
    System.out.println("Gana el jugador " + ganador);
}
}
}