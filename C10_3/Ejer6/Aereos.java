package recuperaciones.C10_3.Ejer6;

public class Aereos extends vehiculos {

    private int numAsientos;

    public int getNumAsientos() {
        return numAsientos;
    }

    public Aereos(int numAsientos){
        super();
        this.numAsientos=numAsientos;
    }
    @Override
    public void imprimir(){
        System.out.println("Vehículo aéreo: ");
        super.imprimir();
        System.out.println("Número de asientos: "+this.numAsientos);
    }
}
