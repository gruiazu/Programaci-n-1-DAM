package Capitulo6;

public class Randoms27 {
    public static void main(String[] args) {
        
        
        // Pedimos la jugada del usuario
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugadaUsuario = System.console().readLine();
        
        // Generamos la jugada del ordenador
        int jugadaOrdenador = (int) (Math.random() * 3); // 0: piedra, 1: papel, 2: tijera
        
        // Mostramos la jugada del ordenador
        String Texto;
        switch (jugadaOrdenador) {
            case 0:
                Texto = "piedra";
                break;
            case 1:
                Texto = "papel";
                break;
            case 2:
                Texto = "tijera";
                break;
            default:
                Texto = "";
                break;
        }
        System.out.println("Turno del ordenador: " + Texto);
        
        // Evaluamos el resultado
        String resultado;
        if (jugadaUsuario.equals(Texto)) {
            resultado = "Empate";
        } else if ((jugadaUsuario.equals("piedra") && Texto.equals("tijera")) || (jugadaUsuario.equals("papel") && Texto.equals("piedra")) || (jugadaUsuario.equals("tijera") && Texto.equals("papel"))) {
            resultado = "Gana el jugador";
        } else if ((Texto.equals("piedra") && jugadaUsuario.equals("tijera")) || (Texto.equals("papel") && jugadaUsuario.equals("piedra")) || (Texto.equals("tijera") && jugadaUsuario.equals("papel"))) {
            resultado = "Gana el ordenador";
        } else {
            resultado = "Jugada incorrecta";
        }
        
        // Mostramos el resultado
        System.out.println(resultado);
    }
}

