package recuperaciones.C10_3.Ejer1;

import java.util.ArrayList;
import java.util.Iterator;

public class Programa {
    public static void main(String[] args) {
        Producto PM = new Producto("Manzanas", 100);
        Producto PMF = new Producto("Mermelada de fresa", 6);
        Producto PH = new Producto("Papel higiénico", 64);
        Producto PA = new Producto("Abre latas", 5);
        Producto PAC = new Producto("Atún Calvo", 13);
    

    ArrayList<Producto> productos = new ArrayList<>();

    productos.add(PM);
    productos.add(PMF);
    productos.add(PH);
    productos.add(PA);
    productos.add(PAC);     

    System.out.println("Contenido del ArrayList:");
    Iterator<Producto> iterator = productos.iterator();
    while (iterator.hasNext()) {
        Producto producto = iterator.next();
        System.out.println(producto.toString());
    }

    productos.remove(PM);
    productos.remove(PAC);

    Producto PP = new Producto("Plátanos", 456);
    productos.add(2,PP);

    
    System.out.println("Nuevo contenido del ArrayList: ");
    iterator = productos.iterator();
    while (iterator.hasNext()) {
        Producto producto = iterator.next();
        System.out.println(producto.toString());
    }


    productos.clear();
    

    }
}
