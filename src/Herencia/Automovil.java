package Herencia;

public class Automovil extends Vehiculo{

    protected String estado;
    protected String tipo;
    protected int numDePasajeros;
    protected String acciones;

    public Automovil(){
    }

    public Automovil(String marca, String modelo, int anio, String estado, String tipo, int numDePasajeros, String acciones) {
        super(marca, modelo, anio);
        this.estado = estado;
        this.tipo = tipo;
        this.numDePasajeros = numDePasajeros;
        this.acciones = acciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumDePasajeros() {
        return numDePasajeros;
    }

    public void setNumDePasajeros(int numDePasajeros) {
        this.numDePasajeros = numDePasajeros;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    @Override
    public void encendiendo() {

        estado = "Encendiendo...";

        System.out.println("\nEl automovil se esta" + estado);

    }
    @Override
    public void apagar(){

        estado = "Apagado...";

        System.out.println("\nEl automovil se ha " + estado);
    }

    public void acelerar(){

        acciones = "Avanzando...";

        System.out.println("\nEl automovil esta " + acciones);
    }

    public void retroceder(){

        acciones = "Retrocediendo...";

        System.out.println("\nEl automovil esta " + acciones);
    }
}

