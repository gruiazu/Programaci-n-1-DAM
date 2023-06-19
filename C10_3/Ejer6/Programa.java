package recuperaciones.C10_3.Ejer6;
import java.util.ArrayList;

import recuperaciones.C10_3.Ejer6.Acuaticos;
import recuperaciones.C10_3.Ejer6.vehiculos;
import recuperaciones.C10_3.Ejer6.Terrestres;

public class Programa {
    public static void main(String[] args){

        ArrayList<vehiculos> arrayVehiculos= new ArrayList<vehiculos>();
        
        Coches deportivo = new Coches();
        deportivo.setMatricula("1234ABC");
        deportivo.setAire(true);
        deportivo.setModelo("Porsche Taycan eléctrico");
        arrayVehiculos.add( deportivo);
    
        Avion caza = new Avion(4);
        caza.setModelo("AB123");
        caza.setMatricula("1234567ABCD");
        caza.setTiempoMax(5);
        arrayVehiculos.add(caza);
    
        Acuaticos barca = new Acuaticos();
        barca.setMatricula("123ABCDEFGHIJK");
        barca.setModelo("Tender 350");
        arrayVehiculos.add(barca);
    
        Terrestres terrestre = new Terrestres();
        terrestre.setMatricula("1234ABD");
        terrestre.setModelo("Furgoneta");
        arrayVehiculos.add(terrestre);
    
        Aereos aereo = new Aereos(8);
        aereo.setMatricula("12345678ABCD");
        aereo.setModelo("jet");
        arrayVehiculos.add(aereo);
    
        Barcos barco = new Barcos();
        barco.setEslora(5);
        barco.setMatricula("123ABCDRTGAE");
        barco.setModelo("Bombard MAX 2");
        barco.setTieneMotor(true);
        arrayVehiculos.add(barco);
    
        Helicopteros helicoptero = new Helicopteros(2);
        helicoptero.setNumHelices(4);
        helicoptero.setMatricula("12345656BDJ");
        helicoptero.setModelo("Sokol W3A/AS-Sokol");
        arrayVehiculos.add(helicoptero);
    
        Motos moto = new Motos();
        moto.setColor("verde");
        moto.setMatricula("342TREN");
        moto.setModelo("Kawasaki Ninja ZX-4RR 2024");
        moto.setCantRuedas(2);
        arrayVehiculos.add(moto);
    
        Submarinos submarino = new Submarinos();
        submarino.setEslora(10);
        submarino.setMatricula("123ABCDEFGHIJK");
        submarino.setModelo("Submarinos Clase Borei");
        submarino.setProfundidadMaxima(1500);
        arrayVehiculos.add(submarino);
    
        for(int i=0;i<arrayVehiculos.size();i++){
            arrayVehiculos.get(i).imprimir();
            System.out.println("_____________________");
        }
        
    }
    
}
