package recuperaciones.C10_3.Ejer6;

public class Avion extends Aereos {

    private double tiempoMax;

    public double getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(double tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    public Avion(int numAsientos){
        super(numAsientos);
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tiempo máximo de vuelo: "+getTiempoMax());
    }
}
