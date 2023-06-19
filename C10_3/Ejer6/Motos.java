package recuperaciones.C10_3.Ejer6;

public class Motos extends Terrestres {
    
    private String color;

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Color: "+getColor());
    }
}
