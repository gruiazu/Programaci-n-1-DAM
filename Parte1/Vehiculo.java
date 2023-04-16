package JAVA.Capítulo14.Parte1;

public class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private int kilometrosRecorridos = 0;

    public Vehiculo() {
        vehiculosCreados++;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void recorrer(int km) {
        kilometrosRecorridos += km;
        kilometrosTotales += km;
    }
}
