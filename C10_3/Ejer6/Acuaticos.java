package recuperaciones.C10_3.Ejer6;

public class Acuaticos extends vehiculos {
    
    private int eslora;

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora=eslora;
    }

    public Acuaticos(){
        super();
        this.eslora=eslora;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Eslora: "+getEslora());
    }
}
