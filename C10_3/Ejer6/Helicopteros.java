package recuperaciones.C10_3.Ejer6;

public class Helicopteros extends Aereos {

    private int numHelices;

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    public Helicopteros(int numAsientos){
        super(numAsientos);
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Número de hélices del helicóptero: "+this.numHelices);
    }
}
