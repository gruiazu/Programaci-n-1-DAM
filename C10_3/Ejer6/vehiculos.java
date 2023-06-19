package recuperaciones.C10_3.Ejer6;

public abstract class vehiculos {

    private String matricula;
    private String modelo;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public vehiculos(){

    }
    public void imprimir(){
        System.out.println("Matrícula: "+getMatricula()+" Modelo: "+getModelo());
    }
}
