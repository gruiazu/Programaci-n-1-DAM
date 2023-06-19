package recuperaciones.C10_3.Ejer6;

public class Submarinos extends Acuaticos{
    
    private int profundidadMax;

    public int getProfundidadMax() {
        return profundidadMax;
    }

    public void setProfundidadMaxima(int profundidadMax) {
        this.profundidadMax = profundidadMax;
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Profundidad máxima: "+getProfundidadMax());
    }
}
