package recuperaciones.C10_3.Ejer1;

public class Producto {

    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public String getNombreProducto() {
        return nombre;
    }

    public int getCantidadProducto() {
        return cantidad;
    }

    public void SetNombreProducto(String nombre) {
        this.nombre=nombre;
    }

    public void SetCantidadProducto(int cantidad) {
        this.cantidad=cantidad;
    }
    
    @Override
    public String toString() {
        return "Nombre del producto = "+nombre+" / cantidad del producto = "+cantidad;
    }

}
