package recuperaciones.C10_3.Ejer6;

public class Barcos extends Acuaticos{   

    private boolean tieneMotor;

    public boolean getMotor() {
        return tieneMotor;
    }
    
    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        if(getMotor()==true){
        System.out.println("El barco disponde de motor");
    }
    }
}
