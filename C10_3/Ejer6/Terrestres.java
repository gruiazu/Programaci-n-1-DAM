package recuperaciones.C10_3.Ejer6;

public class Terrestres extends vehiculos {
    
    private int ruedas;

    public int getCantRuedas(){
        return ruedas;
    }

    public void setCantRuedas(int ruedas){
        this.ruedas=ruedas;
    } 

    public Terrestres(){
        super();
    }

    @Override
    public void imprimir() {
        System.out.println("Cantidad de ruedas (vehículo terrestre): "+getCantRuedas());
    }
}
