package recuperaciones.C10_3.Ejer6;

public class Coches extends Terrestres {

    private boolean aire;

    public boolean getAire(){
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire=aire;
    }

    public Coches(){
        super();
    }

    @Override
    public void imprimir(){
        super.imprimir();
        if (this.aire==true) {
            System.out.println("El coche dispone de aire acondicionado");
        }
    }
}
